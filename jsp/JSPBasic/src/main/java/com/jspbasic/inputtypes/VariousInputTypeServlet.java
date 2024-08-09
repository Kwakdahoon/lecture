package com.jspbasic.inputtypes;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspbasic.inputtypes.vo.Member;

@WebServlet("/VariousInputTypeServlet")
public class VariousInputTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VariousInputTypeServlet() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("agree")); // 체크하면 Y 체크안하면 null
		
		if (request.getParameter("agree") != null && request.getParameter("agree").equals("Y")) {
			String userId = request.getParameter("userId");
			String pwd1 = request.getParameter("pwd1");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			String birthStr = request.getParameter("birth");
			Date birth = Date.valueOf(birthStr);
			
			String gender = request.getParameter("gender");
			String age = request.getParameter("age");
//			String hobby = request.getParameter("hobby"); // checkboxes
			String[] hobbies = request.getParameterValues("hobby");
			String hobby = "";
			
			for(String h : hobbies) {
				System.out.println(hobby);
				hobby += h + ", ";
			}
			
			
			String job = request.getParameter("job"); // select-option
			String memo = request.getParameter("memo"); // 
			
			System.out.println("userId : " + userId);
			System.out.println("pwd1 : " + pwd1);
			System.out.println("email : " + email);
			System.out.println("mobile : " + mobile);
			System.out.println("birth : " + birthStr);
			System.out.println("gender : " + gender);
			System.out.println("age : " + age);
			System.out.println("job : " + job);
			System.out.println("memo : " + memo);
			
			Member member = new Member(userId, pwd1, email, mobile, birth, gender, Integer.parseInt(age), hobby, job, memo);
			
			System.out.println(member.toString());
			
			// member객체를 request에 바인딩
			request.setAttribute("member", member);
			RequestDispatcher rd = request.getRequestDispatcher("outputMember.jsp");
			rd.forward(request, response);
			
		}
	}

}
