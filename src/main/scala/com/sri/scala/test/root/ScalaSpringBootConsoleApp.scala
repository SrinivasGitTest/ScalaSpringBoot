package com.sri.scala.test.root

import java.util.TimeZone

import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.apache.commons.dbcp2.BasicDataSource
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.mapper.MapperFactoryBean
import com.sri.scala.test.root.dataAccess.mapper.DataAccessMapperAnnotation
import com.sri.scala.test.root.service.ScalaTestServiceImpl
import scala.collection.mutable.ListBuffer
import com.sri.scala.test.root.service.ScalaTestService

object ScalaSpringBootConsoleApp extends App  {
  
  TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		//SpringApplication.run(classOf[SpringBootScala]);
    val timeMilliSec : Long = System.currentTimeMillis();
    val test : ScalaTestService = new ScalaTestServiceImpl();
    var listData = test.getUserReviewData(500, null)
		System.out.println("Deployment Completed===:"+listData.size);
    println("Processing TIme==:"+(System.currentTimeMillis() - timeMilliSec))
    listData.foreach(data => println(data.userId))
    println("Processing TIme==:"+(System.currentTimeMillis() - timeMilliSec))
  	
}