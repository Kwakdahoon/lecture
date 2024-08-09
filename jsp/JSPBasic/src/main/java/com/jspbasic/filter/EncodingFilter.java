package com.jspbasic.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class EncodingFilter implements Filter{

	private String charset = "utf-8";
	// 클라이언트 요청이 있을 때 마다 실행이됨
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("필터 동작중........");
		// 전처리
		request.setCharacterEncoding(charset);
		response.setContentType("text/html; charset=" + charset);
		
		chain.doFilter(request, response); // 서블릿 요청이 이어짐.
		
		// 후처리
		
	}

}
