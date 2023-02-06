package com.smithexperience.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.smithexperience.lc.formatter.LCPhoneNumberFormatter;

/**
 * 
 * JAVA CONFIGURATION CONCEPT:
 * 	-- instead of using .xml config files; we can use Java annotations and Java classes to REPLACE
 *  -- ALL the xml configuration of beans, and DispatcherServlets, etc
 *
 *	-- ANNOTATIONS:
 *		--@Configuration: tells servletContext to read this Java Class as the configuration file
 *		--@ComponentScan: tells servletContext to scan this Java Class for ?
 *
 *	-- ViewResolver: set the params in the Java class config file vs the .xml
 *	-- Formatter: WebMvcConfigurer --used to format an object to convert or display
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.smithexperience.lc.controllers")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {
	
	//set up ViewResolver
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		/**
		 * this formatter will help with data binding when working the Nested Objects
		 */
		registry.addFormatter(new LCPhoneNumberFormatter());
		
	}
	

}
