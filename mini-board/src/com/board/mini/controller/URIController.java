package com.board.mini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URIController extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("Get방식일때 호출되는 메소드.");
		String uri = "/WEB-INF"+request.getRequestURI()+".jsp";
		out.println("<br>니가 나한테 요청한 페이지 : "+uri);
		out.println("<br>니가 보낸 a값 : "+request.getParameter("a"));
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		request.setAttribute("test",  "집에가고싶당");
		rd.forward(request,response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("Post방식일때 호출되는 메소드.");
	}

}
