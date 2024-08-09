package com.jspbasic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userpupu")
public class UserPSPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserPSPost() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
//		System.err.println("범죄자 이름 : " + name + ", 범죄자 아이디 : " + id + ", 범죄자 비밀번호 : " + pw);
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
	  out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>POST방식 출력 응답</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div> 이름 : " + name + "</div>");
      out.write("<div> 아이디 : " + id + "\n</div>");
      out.write("<div> 비밀번호 : " + pw + "\n</div>");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
		
	}

}
