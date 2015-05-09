package com.cdi.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.jboss.arquillian.junit.InSequence;
import org.junit.Test;

import com.cdi.example.GreetingCard;
import com.cdi.example.GreetingCardType;
import com.cdi.example.QGreeting;
/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
public class GreetingTest extends AbstractArquillianTest {

	@Inject
	@QGreeting(GreetingCardType.HELLO)
	private GreetingCard greetingCard;

	@Inject
	@QGreeting(GreetingCardType.HI)
	private GreetingCard anotherGreetingCard;

	@Test
	@InSequence(0)
	public void getGreetingCard(){
		assertNotNull(greetingCard);
		assertEquals("Have a nice day!!!", greetingCard.sayHello());
	}

	@Test
	@InSequence(1)
	public void getAntherGreetingCard(){
		assertNotNull(anotherGreetingCard);
		assertEquals("Hello!!!", anotherGreetingCard.sayHello());
	}
}
