package com.ggchina.ssm.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * S:source，被转换的类型
 * T：target，目标类型，要转换成的类型
 * <p>Title: cn.itcast.ssm.converterMyDateConverter.java</p>
 * <p>Description:</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.九纹龙
 * @date	2018年4月27日下午6:31:38
 * @version 1.0
 */
public class MyDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String arg0) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(arg0);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}


}
