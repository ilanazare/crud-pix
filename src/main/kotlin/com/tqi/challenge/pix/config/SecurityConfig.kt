package com.tqi.challenge.pix.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig() {
    @Autowired
    private lateinit var userDetailsService: UserDetailsService

    @Order(1)
    @Bean
    fun authorityWithFilterChain(http: HttpSecurity): SecurityFilterChain {
        http.invoke {
            securityMatcher("/customer/**")
            securityMatcher("/account/**")
            securityMatcher("/payment/**")
            securityMatcher("/user/**")
            authorizeRequests {
                authorize("/customer/**", hasAuthority("ADMIN"), hasAuthority("USER"))
                authorize("/account/**", hasAuthority("USER"))
                authorize("/payment/**", hasAuthority("USER"))
                authorize("/user/**", permitAll)
            }
            httpBasic { }
        }
        return http.build()
    }

//    @Bean
//    fun bCryptPasswordEncoder(): BCryptPasswordEncoder = BCryptPasswordEncoder()
//
//    fun configure(auth: AuthenticationManagerBuilder) {
//        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder())
//    }
}
