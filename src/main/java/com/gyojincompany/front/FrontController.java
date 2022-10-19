package com.gyojincompany.front;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GET방식으로 요청왔음!");
		
		actionDo(request, response);
		
//		String uri = request.getRequestURI();
//		System.out.println("uri : " + uri);
//		String conPath = request.getContextPath();
//		System.out.println("context Path : " + conPath);
//		String command = uri.substring(conPath.length());
//		System.out.println("command : " + command);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("POST방식으로 요청왔음!");
		
		actionDo(request, response);
		
//		String uri = request.getRequestURI();
//		System.out.println("uri : " + uri);
//		String conPath = request.getContextPath();
//		System.out.println("context Path : " + conPath);
//		String command = uri.substring(conPath.length());
//		System.out.println("command : " + command);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		String conPath = request.getContextPath();
		System.out.println("context Path : " + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command : " + command);
	}

}
