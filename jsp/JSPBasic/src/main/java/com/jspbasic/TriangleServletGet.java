package com.jspbasic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hTriangle")
public class TriangleServletGet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TriangleServletGet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.print("GET방식 호출");

        // 클라이언트로부터 전달된 매개변수를 받아옴
        String height = request.getParameter("height");
        String width = request.getParameter("width");

        // 문자열을 double로 변환
        double w = Double.parseDouble(width);
        double h = Double.parseDouble(height);

        // 삼각형의 면적 계산
        double area = (h * w) / 2;

        System.out.println("니가 원한 정답은 바로 : " + area);

        // 클라이언트로 응답하기 위한 설정
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        // HTML 응답 작성
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("<head>\r\n");
        out.write("<meta charset=\"UTF-8\">\r\n");
        out.write("<title>GET방식 출력 응답</title>\r\n");
        out.write("</head>\r\n");
        out.write("<body>\r\n");
        out.write("<h1>삼각형의 면적은: " + area + "</h1>");
        out.write("</body>\r\n");
        out.write("</html>\r\n");  // 잘못된 태그를 수정하여 종료 태그 추가
    }
}
