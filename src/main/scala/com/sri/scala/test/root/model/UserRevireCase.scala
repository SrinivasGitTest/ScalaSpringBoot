package com.sri.scala.test.root.model

import java.util.Date
import scala.beans.BeanProperty

class UserReviewCase (@BeanProperty var userId : String, @BeanProperty var userActDt : Date, @BeanProperty var reviewerName : String, @BeanProperty var reviewCount : Integer, 
                          @BeanProperty var reviewUseCount : Integer, @BeanProperty var reviewFunnyCount : Integer, @BeanProperty var refUserId : String, 
                          @BeanProperty var reviewFansCount : Integer, @BeanProperty var avgStartCount : Float);