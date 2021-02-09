package com.sri.scala.test.root.service

import com.sri.scala.test.root.model.UserReview
import com.sri.scala.test.root.model.UserReviewCase

trait ScalaTestService {
  def getUserReviewData(reviewCt : Integer, reviewDate : String) : Array[UserReviewCase];
}