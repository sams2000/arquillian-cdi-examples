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
import com.cdi.example.QGreeting;

/**
 * It's tested and verified in AS@P webprofile 1.1.8
 * @author bzhou3
 * @since 2015-02-10
 */
@WebServlet(name = "greetingServlet", urlPatterns = {"/sayHello"})
public class GreetingServlet extends HttpServlet {

	private static final long serialVersionUID = 2280890757609124481L;

	@Inject
	@QGreeting(GreetingCardType.HELLO)
	private GreetingCard greetingCard;

	@Inject
	@QGreeting(GreetingCardType.HI)
	private GreetingCard anotherGreetingCard;

	@Override
	public void init() throws ServletException {
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  out.println("<h1>" + greetingCard.sayHello() + "</h1>");
		  out.println("<h1>" + anotherGreetingCard.sayHello() + "</h1>");
	}

	@Override
	public void destroy(){
	}

}

