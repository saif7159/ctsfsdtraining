package com.boot.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boot.mapper.BootMapper;
import com.boot.mapper.BootMapperImpl;
import com.boot.model.Boots;
import com.boot.model.BootsDto;
import com.boot.service.BootService;
import com.boot.service.BootServiceImpl;

public class UpdateProcessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BootService bs = null;
	BootMapper bm = null;
	public void init(ServletConfig config) throws ServletException {
		bs = new BootServiceImpl();
		bm = new BootMapperImpl();
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
		PrintWriter out=response.getWriter();
		String email = request.getParameter("selleremail").toString();
		int size = Integer.parseInt(request.getParameter("sellersize").toString());
		String[] boot = request.getParameter("bootname").toString().split(" ");
		String brand = boot[0];
		String name = boot[1];
		int id = Integer.parseInt(request.getParameter("bid"));
		System.out.println(id);
		
		Boots boots = bs.findById(id);
		boots.setName(name);
		boots.setBrand(brand);
		boots.setEmail(email);
		bs.updateBoot(boots);
		if(boots!=null)
		{	
			RequestDispatcher view = request.getRequestDispatcher("loaddetail.do");
			view.forward(request, response);
		} 
		
	}

}
