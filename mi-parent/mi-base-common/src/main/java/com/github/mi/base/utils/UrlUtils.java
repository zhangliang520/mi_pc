package com.github.mi.base.utils;

import java.util.HashMap;
import java.util.Map;

public class UrlUtils {
	/**
	 * 将url参数转换成map
	 * 
	 * @param param aa=11&bb=22&cc=33
	 * @return
	 */
	public static Map<String, String> getUrlParams(String param) {
		Map<String, String> map = new HashMap<String, String>(0);
		if ("".equals(param)||param==null) {
			return map;
		}
		String[] params = param.split("&");
		for (int i = 0; i < params.length; i++) {
			String[] p = params[i].split("=");
			if (p.length == 2) {
				map.put(p[0], p[1]);
			}
		}
		return map;
	}
}
