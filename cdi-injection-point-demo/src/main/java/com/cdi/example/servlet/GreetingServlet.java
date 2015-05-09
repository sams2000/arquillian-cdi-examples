package com.cdi.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdi.example.GreetingCard;
import com.cdi.example.GreetingCardType;
import com.cdi.example.QGreetings;
import com.cdi.example.GreetingCardType.Greetings;

/**
 * refer to http://www.javacodegeeks.com/2013/06/java-ee-cdi-programmatic-dependency-disambiguation-example-injection-point-inspection.html
 * @author bzhou3
 * @since 2015-02-10
 */

@WebServlet(name = "greetingServlet", urlPatterns = {"/sayHello"})
public class GreetingServlet extends HttpServlet {

	private static final long serialVersionUID = 2280890757609124481L;
	
	@Inject
	@QGreetings
	@GreetingCardType(Greetings.HELLO)
	private GreetingCard greetingCard;

	@Inject
	@QGreetings
	@GreetingCardType(Greetings.HI)
	private GreetingCard anotherGreetingCard;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + greetingCard.sayHello() + "</h1>");
		out.println("<h1>" + anotherGreetingCard.sayHello() + "</h1>");
	}

}

