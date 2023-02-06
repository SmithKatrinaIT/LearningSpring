package com.smithexperience.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	/**
	 * 
	 * JAVA CONFIGURATION CONCEPT:
	 * 	-- This is the 2nd Approach: 
	 * 		-- Framework implementation to handle defining the Dispatcher Servlet
	 * 		-- and registering the servlet with the ServletContext
	 * -- The AbrstractAnnotationCongfigDispatcherServletInitializer class provides 3 methods to implement:
	 * 		-- getRootConfigClasses
	 * 		-- getServletConfigClasses: here we register the App Configuration class name
	 * 		-- getServletMappings:  here we set the URL mapping [for our Dispatcher (front controller)]
	 * 		-- as in the xml config file or the 1st Approach Java configuration example -- LoveCalculatorApplicationInitializer class
	 */	
	
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = {LoveCalculatorAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = {"/"};
		return arr;
	}

}
