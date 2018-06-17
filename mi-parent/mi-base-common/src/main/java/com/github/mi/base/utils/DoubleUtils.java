package com.github.mi.base.utils;

import java.text.DecimalFormat;

public class DoubleUtils {
   public static double DecimalFormatDouble(double param) {
	   DecimalFormat    df   = new DecimalFormat("######0.00"); 
	   double returnDouble= df.format(param)==null?0:Double.parseDouble(df.format(param).toString());
	   return returnDouble;
}
}
