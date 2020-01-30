package com.boot.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boot.service.BootService;
import com.boot.service.BootServiceImpl;


public class DeleteProcessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BootService bs = null;
	@Override
	public void init() throws ServletException {
		bs = new BootServiceImpl();
		super.init();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("inside");
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("did"));
		bs.deleteBoot(id);
		RequestDispatcher view = request.getRequestDispatcher("loaddetail.do");
		view.forward(request, response);
	}
	

}
