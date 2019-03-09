package com.ggchina.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, 
			HttpServletResponse response, Object handler,
			Exception e) {
		ModelAndView mv = new ModelAndView();
		//1.判断异常类型，设置提示信息
		if(e instanceof MaxUploadSizeExceededException){
			mv.addObject("errorMsg", "对不起，您上传的文件超过最大长度！");
		} else {
			mv.addObject("errorMsg", "对不起，由于您的操作导致系统出现未知异常，异常信息如下："+e.getMessage()+"<br/>请联系管理员解决！");
		}
		//2.设置异常视图
		mv.setViewName("error");
		return mv;
	}

}
