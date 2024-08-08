package com.jspbasic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hGETT") // 매핑주소
public class HelloServletGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelloServletGet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET방식 호출됨");
		
		String name = request.getParameter("name");
		System.out.println("이름 : " + name);
		
		
		// 출력 방식 (1)
		
		response.setContentType("text/html; charset=utf-8"); 
		// 응답할 문서의 종류와 인코딩 방식을 설정 (out객체를 얻어 오기 전에 설정해야 한다)
		
		PrintWriter out = response.getWriter();
		  out.write(name);
		  out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>GET방식 출력 응답</title>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<h1>" + name + "</h1>");
	      out.write("</body>\r\n");
	      out.write("<html>\r\n");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
