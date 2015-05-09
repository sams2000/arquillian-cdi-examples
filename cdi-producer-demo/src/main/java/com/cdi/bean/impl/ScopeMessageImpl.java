package com.cdi.bean.impl;

import javax.enterprise.context.RequestScoped;

import com.cdi.bean.Message;


/**
 * If SomeService(ScopeMessageSender) parameter is a bean defined - for example - as
 * RequestScoped it would be promoted to SessionScoped by the Producer method
 * and then returned to the caller. This is a problem!
 *
 * The SomeService instance will be destroyed as soon as the current HTTP
 * request finishes and CDI will then have a broken reference to SomeService -
 * supposedly SessionScoped - instance and consequently provide unpredictable
 * results to further SomeService injections.
 *
 * We could change the scope of SomeService bean but that would affect all other
 * consumers of the bean! Another approach is to use the New qualifier:
 *
 * @author bzhou3
 *
 */
@RequestScoped
public class ScopeMessageImpl implements Message {

	@Override
	public String sendMessage() {
		return "Sending scope message";
	}

}
