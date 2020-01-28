package com.boot.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boot.dao.BootsDao;
import com.boot.dao.BootsDaoImpl;
import com.boot.mapper.BootMapper;
import com.boot.mapper.BootMapperImpl;
import com.boot.model.Boots;
import com.boot.model.BootsDto;
import com.boot.service.BootService;
import com.boot.service.BootServiceImpl;


public class AddBootServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	private StringBuffer data;
	BootService bs = null;
	BootMapper bm = null;
	@Override
	public void init() throws ServletException {
		super.init();
		data=new StringBuffer();
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email = request.getParameter("selleremail").toString();
		int size = Integer.parseInt(request.getParameter("sellersize").toString());
		String[] boot = request.getParameter("bootname").toString().split(" ");
		String brand = boot[0];
		String name = boot[1];
		
		BootsDto dto = new BootsDto(brand, name, size, email, UUID.randomUUID().toString());
		Boots boots = bs.createBoot(bm.bootsDtoToBoots(dto));
		if(boots!=null)
		{	List<Boots> bootlist = bs.allBoots(); 
			request.setAttribute("allboots", bootlist);	
			RequestDispatcher view=request.getRequestDispatcher("AllBoots.jsp");
			view.forward(request, response);
			
		}
		
	}

}
