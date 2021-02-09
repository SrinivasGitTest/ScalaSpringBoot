package com.sri.scala.test.root.model

import java.util.Date

case class UserReviewCase (userId : String, userActDt : Date, reviewerName : String, reviewCount : Integer, reviewUseCount : Integer, 
                    reviewFunnyCount : Integer, refUserId : String, reviewFansCount : Integer, avgStartCount : Float);