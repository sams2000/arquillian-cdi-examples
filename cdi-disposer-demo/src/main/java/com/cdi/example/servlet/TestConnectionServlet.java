package com.cdi.example.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdi.example.Connection;
import com.cdi.example.QConnection;

/**
 * CDI Producer methods may be used to create resources that are consumed by an
 * application in a very specific context. These resources may need to be
 * cleaned up by the container when the application doesn't need them any more.
 * This clean up process is provided by CDI in the form of Disposer methods as
 * we will see in this tutorial.
 * 
 * refactor codes from : http://www.byteslounge.com/tutorials/java-ee-cdi-disposer-methods-example 
 * 
 * It's tested and verified in AS@P webprofile 1.1.8
 * @author bzhou
 * @since 2015-02-10
 */
@WebServlet(name = "testServlet", urlPatterns = { "/testServlet" })
public class TestConnectionServlet extends HttpServlet {

	private static final long serialVersionUID = -3995970242890631574L;

	@Inject
	private Connection connection;

	// Why do we need the @TestConnection qualifier? If we did not use the
	// qualifier the container would not know how to inject a Connection because
	// it had to available options: one is to inject a Connection instance by
	// the means of the producer method while the other is to instantiate a
	// ConnectionImpl instance and to inject it directly into the injection
	// point. What we did was to use a qualifier so we can disambiguate between
	// both the of these scenarios.
	@Inject
	@QConnection
	private Connection connection1;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Doing something with connection: "
				+ connection.toString());

		System.out.println("Doing something with connection: "
				+ connection1.toString());

	}
}
