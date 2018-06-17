package com.github.mi.base.utils;

public class StringUtils {

	
	public static String  getSplitSecondString(String str) {
		
		String returnStr="";
		if (org.apache.commons.lang3.StringUtils.isNotBlank(str))
		{
			String[] splitStr = str.split("-");
			System.out.println(splitStr.length);
			if (splitStr != null && splitStr.length > 0)
			{
				if (splitStr.length < 2)
				{
					returnStr = splitStr[0];
					
				}else if(splitStr.length >=2)
				{
					returnStr = splitStr[1];
				}
			}
		}
		
		return returnStr;
	}
public static String  getSplitSecAndThreeString(String str) {
		
		String returnStr="";
		if (org.apache.commons.lang3.StringUtils.isNotBlank(str))
		{
			String[] splitStr = str.split("-");
			System.out.println(splitStr.length);
			if (splitStr != null && splitStr.length > 0)
			{
				if (splitStr.length < 2)
				{
					returnStr = splitStr[0];
					
				}else if(2<=splitStr.length&&splitStr.length<3 ){
					returnStr = splitStr[1];
				}else if(splitStr.length>=3 ){
					returnStr = splitStr[1]+splitStr[2];
				}
			}
		}
		
		return returnStr;
	}
}
