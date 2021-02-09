package com.sri.scala.test.root.service

import java.util.Date



import org.springframework.context.annotation.ComponentScan
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.stereotype.Service

import com.sri.scala.test.root.dataAccess.mapper.DataAccessMapperAnnotation
import com.sri.scala.test.root.model.UserReview
import com.sri.scala.test.root.model.UserReviewCase
import com.sri.scala.test.root.util.CustomDateUtil

@Service
@ComponentScan(basePackages = Array("com.sri.scala.test.root.service"))
class ScalaTestServiceImpl extends ScalaTestService  {
  
  val context = new ClassPathXmlApplicationContext("spring/app-context.xml");
  
  val custDate : CustomDateUtil = new CustomDateUtil();
  override def getUserReviewData(reviewCt : Integer, reviewDate : String) : Array[UserReviewCase] = {
    //val oracMapper : DataAccessMapperAnnotation  = context.getBean("oracMapper").asInstanceOf[DataAccessMapperAnnotation];
    val oracMapper : DataAccessMapperAnnotation  = context.getBean("oracMapper").asInstanceOf[DataAccessMapperAnnotation];
    var reviewUtilDate : Date = custDate.getUtilDate(reviewDate);
    var dataList : Array[UserReviewCase] =  oracMapper.getuserReviewData(reviewCt, reviewUtilDate);
    //dataList.foreach(data => println(data.userId))
    return dataList;
  }
}