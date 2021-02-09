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

object ScalaSpringBootConsoleApp extends App  {
  
  TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		//SpringApplication.run(classOf[SpringBootScala]);
    val timeMilliSec : Long = System.currentTimeMillis();
    val test : ScalaTestServiceImpl = new ScalaTestServiceImpl();
    var listData = test.getUserReviewData(100, null)
		System.out.println("Deployment Completed===:"+listData.size);
    println("Processing TIme==:"+(System.currentTimeMillis() - timeMilliSec))
    println(listData)
    println("Processing TIme==:"+(System.currentTimeMillis() - timeMilliSec))
  	
}