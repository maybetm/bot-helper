package com.maybetm.bothelper.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.view.JstlView

/**
 * @author zebzeev-sv
 * @version 06.11.2019 22:39
 */
@Configuration
@EnableWebMvc
class WebMvcConfiguration : WebMvcConfigurationSupport() {

    @Bean
    fun viewResolver(): ViewResolver {
        val viewResolver = InternalResourceViewResolver()
        viewResolver.setViewClass(JstlView::class.java)
        viewResolver.setPrefix("/WEB-INF/jsp/")
        viewResolver.setSuffix(".jsp")
        return viewResolver
    }
}

