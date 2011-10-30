package com.blogspot.nurkiewicz

import org.springframework.web.servlet.config.annotation.{WebMvcConfigurerAdapter, EnableWebMvc}
import org.springframework.context.annotation.{Configuration, ComponentScan}

/**
 * @author Tomasz Nurkiewicz
 * @since 30.10.11, 13:32
 */
@Configuration
@ComponentScan(basePackages = Array("com.blogspot.nurkiewicz.web"))
@EnableWebMvc
class RestConfiguration extends WebMvcConfigurerAdapter {

	println("RestConfiguration")

}