package com.boot.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boot.model.Boots;
import com.boot.service.BootService;
import com.boot.service.BootServiceImpl;


public class LoadBoots extends HttpServlet {
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
		
		List<Boots> bootlist = bs.allBoots(); 
		request.setAttribute("loadboots", bootlist);	
		RequestDispatcher view=request.getRequestDispatcher("AllBoots.jsp");
		view.forward(request, response);
	}
	
}
