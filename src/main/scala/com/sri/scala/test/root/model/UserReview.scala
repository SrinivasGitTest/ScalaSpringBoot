package com.sri.scala.test.root.model

import java.util.Date

class UserReview {
  
  var userId : String = null;
  var userActDt : Date = null;
  var reviewerName : String = null;
  var reviewCount : Integer = null;
  var reviewUseCount : Integer = null;
  var reviewFunnyCount : Integer = null;
  var refUserId : String = null;
  var reviewFansCount : Integer = null;
  var avgStartCount : Double = 0;
  
  def setUserId(userId: String): Unit = { this.userId = userId }
  def getUserId(): String = this.userId
  
  def setUserActDt(userActDt: Date): Unit = { this.userActDt = userActDt }
  def getUserActDt(): Date = this.userActDt
  
  def setReviewerName(reviewerName: String): Unit = { this.reviewerName = reviewerName }
  def getReviewerName(): String = this.reviewerName
  
  def setReviewCount(reviewCount: Integer): Unit = { this.reviewCount = reviewCount }
  def getReviewCount(): Integer = this.reviewCount
  
  def setReviewFunnyCount(reviewFunnyCount: Integer): Unit = { this.reviewFunnyCount = reviewFunnyCount }
  def getReviewFunnyCount(): Integer = this.reviewFunnyCount
  
  def setReviewUseCount(reviewUseCount: Integer): Unit = { this.reviewUseCount = reviewUseCount }
  def getReviewUseCount(): Integer = this.reviewUseCount
  
  
  def setRefUserId(refUserId: String): Unit = { this.refUserId = refUserId }
  def getRefUserId(): String = this.refUserId
  
  def setReviewFansCount(reviewFansCount: Integer): Unit = { this.reviewFansCount = reviewFansCount }
  def getReviewFansCount(): Integer = this.reviewFansCount
  
  def setAvgStartCount(avgStartCount: Double): Unit = { this.avgStartCount = avgStartCount }
  def getAvgStartCount(): Double = this.avgStartCount
  
}