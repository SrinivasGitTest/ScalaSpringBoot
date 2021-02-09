package com.sri.scala.test.root

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.env.EnvironmentPostProcessor
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan
import org.springframework.core.env.ConfigurableEnvironment
import org.springframework.core.env.StandardEnvironment
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.context.annotation.ImportResource

@EnableAutoConfiguration(exclude = {Array(classOf[DataSourceAutoConfiguration])})
@ComponentScan(basePackages = Array("com.sri.scala.test.root"))
@ImportResource(Array("classpath:spring/app-context.xml"))
@SpringBootApplication
class ScalaSpringBootApplication extends SpringBootServletInitializer with EnvironmentPostProcessor {
  
  @Override
	  def postProcessEnvironment(environment : ConfigurableEnvironment , application : SpringApplication ) :Unit = {
	    application.setAllowBeanDefinitionOverriding(true);
	  }
  
}

/*object ScalaSpringBootApp 
{
  def main(args : Array[String]) {
    TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
    SpringApplication run classOf[ScalaSpringBootApplication];  
  }
}*/

object ScalaSpringBootApp extends App
{
    var app :SpringApplication = new SpringApplication(classOf[ScalaSpringBootApplication]);
    
    var env : StandardEnvironment  = new StandardEnvironment();
		var envSel : String  = if(System.getenv("Env") == "local") System.getenv("Env").trim() else "local" ;
		env.setActiveProfiles(envSel);
		app.setEnvironment(env);
		app.setAllowBeanDefinitionOverriding(true);
		app.run(classOf[ScalaSpringBootApplication].toString());
    
    
    /*TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
    SpringApplication run classOf[ScalaSpringBootApplication];    */
    
    
}