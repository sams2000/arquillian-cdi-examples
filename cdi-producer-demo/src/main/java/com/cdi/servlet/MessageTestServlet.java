package com.cdi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdi.bean.Message;
import com.cdi.bean.MessageType;
import com.cdi.bean.QMessage;

/**
 * tutorial :
 * http://www.byteslounge.com/tutorials/java-ee-cdi-producer-methods-tutorial
 *
 * Java EE CDI introduced a concept called Producer. Producers may be used to
 * create - or produce - bean instances to be consumed by an application.
 * Producers are also able to provide specific interface implementations
 * according to the consumer needs so they are a valid way to support
 * polymorphism in a CDI application.
 *
 * Producers are also useful to encapsulate bean initialization or even to
 * enable injection of object instances that are not themselves CDI managed
 * beans into some points of our application.
 *
 * refactor code from: http://www.byteslounge.com/tutorials/java-ee-cdi-producer-methods-tutorial
 *
*
 * It's tested and verified in AS@P webprofile 1.4.4
 * @author bzhou3
 * @since 2015-02-10
 */
@WebServlet(name = "messageServlet", urlPatterns = {"/sendMessage"})
public class MessageTestServlet extends HttpServlet {

	private static final long serialVersionUID = -3995970242890631574L;

	@Inject
	@QMessage(MessageType.SCOPE)
	private Message message;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {



		PrintWriter out = response.getWriter();
		out.println("Testing output: " + message.sendMessage());
		out.close();
	}
}
