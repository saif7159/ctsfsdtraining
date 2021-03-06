package com.boot.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boot.model.Boots;
import com.boot.service.BootService;
import com.boot.service.BootServiceImpl;


public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BootService bs = null;
	public void init(ServletConfig config) throws ServletException {
		bs = new BootServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Boots b = bs.findById(Integer.parseInt(request.getParameter("id")));
		System.out.println(b);
		request.setAttribute("boots", b);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateData.jsp");
		dispatcher.forward(request, response);
		
	}

}
