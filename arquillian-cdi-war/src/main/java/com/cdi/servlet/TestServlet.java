package com.cdi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdi.bean.Service;
/**
 * It's tested and verified in AS@P webprofile 1.1.8
 * @author bzhou3
 * @since 2015-02-10
 */
@WebServlet(name = "testServlet", urlPatterns = {"/testcdi"})
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 2638127270022516617L;

	//CDI way 1 : Inject Service object for field injection
	@Inject
	private Service service1;

	//CDI way 2: Use constructor method injection
	private Service service2;
	@Inject
	public TestServlet(Service service){
		this.service2 = service;
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		int a = 2;
		int b = 3;

		PrintWriter out = response.getWriter();
		out.println("Hello World, service 1 does work: " + service1.doWork(a, b));
		out.println("Hello World: service 2 does work: " + service1.doWork(a, b));
		out.close();
	}

}
