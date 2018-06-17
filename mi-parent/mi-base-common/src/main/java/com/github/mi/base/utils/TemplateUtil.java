package com.github.mi.base.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TemplateUtil {

	/**
	 * 发送消息模板
	 * @param params
	 * @param templateContent
	 * @return
	 */
	public static String convertContent(Map<String, Object> params, String templateContent) {
		ByteArrayOutputStream bao = null;
		try {
			StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
			stringTemplateLoader.putTemplate("template", templateContent);
			Configuration c = new Configuration();
			c.setTemplateLoader(stringTemplateLoader);

			Template template = c.getTemplate("template");
			bao = new ByteArrayOutputStream();
			Writer out = new OutputStreamWriter(bao);
			template.process(params, out);
			String result = bao.toString("UTF-8");

			IOUtils.closeQuietly(bao);

			return result;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
		return null;
	}
}
