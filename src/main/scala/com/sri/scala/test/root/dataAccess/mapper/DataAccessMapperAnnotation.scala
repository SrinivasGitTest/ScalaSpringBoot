package com.sri.scala.test.root.dataAccess.mapper

import java.util.Date

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.springframework.context.annotation.ComponentScan

import com.sri.scala.test.root.model.UserReviewCase

@Mapper
@ComponentScan(basePackages = Array("com.sri.scala.test.root.dataAccess.mapper"))
trait DataAccessMapperAnnotation {
  
  @Select(Array("""<script>SELECT USERID userId, USER_ACTV_DATE userActDt, REVIEWR_NAME reviewerName, REVIEW_COUNT reviewCount, REVIEW_USEFUL reviewUseCount, 
                           REVIEW_FUNNY reviewFunnyCount, REF_USERID refUserId, REVIEW_FANS reviewFansCount, AVG_STAR_COUNT avgStartCount 
                           FROM user_review WHERE REVIEW_COUNT > #{reviewCt} <if test='reviewDate != null'> AND CAST(USER_ACTV_DATE AS DATE) >= #{reviewDate} </if></script>"""))
  def getuserReviewData(@Param("reviewCt") reviewCt : Integer, @Param("reviewDate")reviewDate : Date): Array[UserReviewCase];
  
  def test() {
    println("Successfully executed");
  }
}