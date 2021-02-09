package com.sri.scala.test.root.service

import java.util.Date

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.stereotype.Service

import com.sri.scala.test.root.dataAccess.mapper.DataAccessMapperAnnotation
import com.sri.scala.test.root.model.UserReviewCase
import com.sri.scala.test.root.util.CustomDateUtil

@Service
@ComponentScan(basePackages = Array("com.sri.scala.test.root.service"))
class ScalaTestServiceImpl   {
  
  val context = new ClassPathXmlApplicationContext("spring/app-context.xml");
  
  val custDate : CustomDateUtil = new CustomDateUtil();
  def getUserReviewData(reviewCt : Integer, reviewDate : String) : Array[UserReviewCase] = {
    val oracMapper : DataAccessMapperAnnotation  = context.getBean("oracMapper").asInstanceOf[DataAccessMapperAnnotation];
    var reviewUtilDate : Date = custDate.getUtilDate(reviewDate);
    return oracMapper.getuserReviewData(reviewCt, reviewUtilDate);
  }
}