package com.cdi.war;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cdi.annotation.QValue;
import com.cdi.annotation.Value;
/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
@WebServlet(name = "testPropertyValueServlet", urlPatterns = {"/testPropertyValueServlet"})
public class TestPropertyValueServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	@QValue
	@Value("app.prop.1")
	private String configValue;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("Hello World: " + configValue);
		out.close();
	}
}
