package com.jspbasic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// url매핑 주소에 /를 안 쓰면 서블릿 매핑에서 유효하지 않은 <url-pattern> [안녕안녕인사해요]
@WebServlet("/안녕안녕인사해요")
public class ValidationServlet extends HttpServlet{
	
    public ValidationServlet() {
        super();
    }
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.print("GET방식 겟또");
		
		int kor = Integer.parseInt(req.getParameter("kor"));
		int eng = Integer.parseInt(req.getParameter("eng"));
		int math = Integer.parseInt(req.getParameter("math"));
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		if (kor <= 0 || kor > 100) {
			out.println("<script>");
			out.println("alert('국어점수 잘못');");
			out.println("location.href='validation.jsp';");
			out.println("</script>");
		}
		
		int tot = kor + eng + math;
		float avg = tot / 3;
		
		System.out.println(tot + avg);
		
		// 출력방식(1)
//		  out.write("<!DOCTYPE html>\r\n");
//	      out.write("<html>\r\n");
//	      out.write("<head>\r\n");
//	      out.write("<meta charset=\"UTF-8\">\r\n");
//	      out.write("<title>성적표</title>\r\n");
//	      out.write("</head>\r\n");
//	      out.write("<body>\r\n");
//	      out.write("<div> 국어 : " + kor + "</div>");
//	      out.write("<div> 영어 : " + eng + "\n</div>");
//	      out.write("<div> 수학 : " + math + "\n</div>");
//	      out.write("<div> 총점 : " + tot + "\n</div>");
//	      out.write("<div> 평균 : " + avg + "\n</div>");
//	      out.write("</body>\r\n");
//	      out.write("<html>\r\n");
		
		// 출력방식 (2)
		// 출력할 변수를 바인딩
		req.setAttribute("kor", kor);
		req.setAttribute("eng", eng);
		req.setAttribute("math", math);
		req.setAttribute("tot", tot);
		req.setAttribute("avg", avg);
		
		// 전송 - 짐 보내기
		RequestDispatcher rd = req.getRequestDispatcher("./outputScore.jsp");
		
		rd.forward(req, resp);
		
	}

}
