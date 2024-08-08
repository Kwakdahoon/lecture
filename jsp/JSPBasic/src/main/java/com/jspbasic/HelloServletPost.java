package com.jspbasic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hPOST") // 매핑주소
public class HelloServletPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServletPost() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("Post방식 호출됨 \n");
		request.setCharacterEncoding("utf-8");
		
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.print("name : " + name + " age : " + age);
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
//		out.write(name);
		 out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>GET방식 출력 응답</title>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div> 이름 : " + name + "</div>");
	      out.write("<div> 나이 : " + age + "\n</div>");
	      out.write("</body>\r\n");
	      out.write("<html>\r\n");
	}

}
