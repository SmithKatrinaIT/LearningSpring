package com.smithexperince.lc.legacy.examples;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer { //implements WebApplicationInitializer {

	/**
	 * 
	 * JAVA CONFIGURATION CONCEPT: -- instead of using .xml config files; we can use
	 * Java annotations and Java classes to REPLACE -- ALL the xml configuration of
	 * beans, and DispatcherServlets, etc
	 *
	 * -- Programmatically launch DispatcherServlet (frontController) -- normally
	 * set in the web.xml file style of configuration -- this Java class must
	 * implement "WebApplicationInitializer" interface -- which has ONE method:
	 * onStartup that takes in the ServletContext -- it must CREATE the
	 * DispatcherServlet and REGISTER the DispatcherServlet with the --
	 * ServletContext
	 *
	 * -- Servlets: Java classes that respond to incoming request (mostly HTTP web
	 * requests; -- each servlet has its own ServletConfig object -- Servlet
	 * Container: AKA Web Container or web server (i.e. tomcat) creates a
	 * ServletContext object for each deployed web application -- Servlet Context:
	 * component/object of the Servlet Container (server); contains the initial
	 * parameters/configuration information to the entire application -- Dispatcher
	 * Servlet: front controller; entry point to the application responsible for
	 * dispatcher requests to the appropriate controllers
	 *
	 * -- ViewResolver
	 *
	 * THIS IS THE CONFIGURATION THAT ALLOWS FOR FULL CONTROL OF SETTING UP A
	 * DISPATCHER SERVLET THERE IS A EASYIER/LESS CODE METHOD TO HAVE THIS GENERATED
	 * AUTOMATICALLY IN THE BACKGROUND
	 */

	/*
	 * @Override public void onStartup(ServletContext servletContext) throws
	 * ServletException {
	 * 
	 * 
	 * //container (application-context) - xml example b4 Java configuration
	 * implementation
	 * 
	 * XmlWebApplicationContext webApplicationContext = new
	 * XmlWebApplicationContext();
	 * webApplicationContext.setConfigLocation("classpath:application-config.xml");
	 * 
	 * //TODO: Create the DispatcherServlet object DispatcherServlet
	 * dispatcherServlet = new DispatcherServlet(webApplicationContext);
	 * 
	 * //TODO: Add/register dispatcher servlet to servlet context
	 * ServletRegistration.Dynamic myCustomDispatcherServlet =
	 * servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
	 * 
	 * myCustomDispatcherServlet.setLoadOnStartup(1);
	 * myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
	 * 
	 * 
	 * //===========================================================================
	 * ==================
	 * 
	 * //JAVA APPLICATION CONTEXT STYLE AnnotationConfigWebApplicationContext
	 * webApplicationContext = new AnnotationConfigWebApplicationContext();
	 * webApplicationContext.register(LoveCalculatorAppConfig.class);
	 * 
	 * 
	 * //set up is the same as above but instead of xml file we use a Java Class for
	 * the configuration file DispatcherServlet dispatcherServlet = new
	 * DispatcherServlet(webApplicationContext);
	 * 
	 * ServletRegistration.Dynamic myCustomDispatcherServlet =
	 * servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
	 * 
	 * myCustomDispatcherServlet.setLoadOnStartup(1);
	 * myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
	 * 
	 * 
	 * }
	 */

}
