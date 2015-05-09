package com.cdi.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;

import com.cdi.bean.impl.EmailMessageImpl;
import com.cdi.bean.impl.ScopeMessageImpl;
import com.cdi.bean.impl.SmsMessageImpl;

@SessionScoped
public class MessageFactory implements Serializable {

	private static final long serialVersionUID = 5269302440619391616L;

	// way 1:
	// Produce CDI managed beans, ie. beans which initialization process should
	// be handled by CDI itself? For example, producing a bean that also has its
	// own CDI dependencies that should be processed by the container during
	// initialization.When we inject a MessageSender implementation in our
	// application the CDI container will initialize a EmailMessageSender
	// instance and inject it into the Producer method as a parameter. Then the
	// method will return the new service instance initialized by CDI.
	@Produces
	@QMessage(MessageType.EMAIL)
	public Message getEmailMessageSender(
			EmailMessageImpl emailMessageSender) {
		return emailMessageSender;
	}

	@Produces
	@QMessage(MessageType.SMS)
	public Message getSmslMessageSender(SmsMessageImpl smsMessageSender) {
		return smsMessageSender;
	}
	
	@Produces
	@QMessage(MessageType.SCOPE)
	public Message getScopeMessageSender(@New ScopeMessageImpl scopeMessageSender){
		return scopeMessageSender;
	}

	// way 2: Producer method will return a distinct message service
	// implementation depending on the qualifier used in the injection point.
	// @Produces
	// @MessageTransport(MessageTransportType.EMAIL)
	// public MessageSender getEmailMessageSender(){
	// return new EmailMessageSender();
	// }
	//
	// @Produces
	// @MessageTransport(MessageTransportType.SMS)
	// public MessageSender getSmsMessageSender(){
	// return new SmsMessageSender();
	// }
	
	//	@Produces
	//	@MessageTransport(MessageTransportType.SCOPE)
	//	public MessageSender getScopeMessageSender(){
	//		return new ScopeMessageSender();
	//	}

}
