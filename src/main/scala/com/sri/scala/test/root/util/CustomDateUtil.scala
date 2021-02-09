package com.sri.scala.test.root.util

import java.util.Date
import java.text.DateFormat
import java.text.SimpleDateFormat

class CustomDateUtil {
  def getUtilDate (strDate : String) : Date = {
    if(strDate == null) return null;
    else {
      val dateFormat : DateFormat = new SimpleDateFormat("yyyy-MM-dd");
      return dateFormat.parse(strDate);
    }
  }
}