package com.boot.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boot.model.Boots;
import com.boot.service.BootService;
import com.boot.service.BootServiceImpl;


public class FootballBootServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BootService bs = null;
	@Override
	public void init() throws ServletException {
		
		super.init();
		bs = new BootServiceImpl();
	}


	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int size = Integer.parseInt(request.getParameter("bootsize").toString());
		//out.print(bs.fetchBoots(size));
		List<Boots> boots = bs.fetchBoots(size);
		if(boots!=null)
		{
		request.setAttribute("bootsize", boots);	
		RequestDispatcher view=request.getRequestDispatcher("BootSize.jsp");
		view.forward(request, response);
		}
		
	}
}
