package com.sri.scala.test.root.controller

import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.sri.scala.test.root.service.ScalaTestServiceImpl

import io.swagger.annotations.ApiParam
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping(Array("/sri/scala/test/sample"))
class ScalaTestController {
  
  var serviceImpl : ScalaTestServiceImpl = new ScalaTestServiceImpl();
  
  @GetMapping (path=Array("/userreviewdata"))
  @ResponseBody
  def getUserReviewData(@RequestParam reviewCount : Integer, 
											@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam (required=false) reviewDate : String,
											@DateTimeFormat(pattern = "dd-MM-yyyy") @RequestParam (required=false) reviewDt : String,
											@ApiParam(allowableValues="Top, Bottom, Middle") @RequestParam(required=false) select : String,
											request : HttpServletRequest ) : Object = {
      println("Testing scala application");
    
      return serviceImpl.getUserReviewData(reviewCount, reviewDate);
      return null;
  }
  
}