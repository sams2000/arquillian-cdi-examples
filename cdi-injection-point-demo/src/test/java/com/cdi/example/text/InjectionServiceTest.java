package com.cdi.example.text;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.jboss.arquillian.junit.InSequence;
import org.junit.Test;

import com.cdi.example.GreetingCard;
import com.cdi.example.GreetingCardType;
import com.cdi.example.GreetingCardType.Greetings;
import com.cdi.example.QGreetings;

/**
 * This testing case failed on 2015-02-11
 * NullPOinterException from line: Annotated gtAnnotated = ip.getAnnotated();
 * @author Bin Zhou
 */
public class InjectionServiceTest extends AbstractArquillianTest {
	@Inject
	@QGreetings
	@GreetingCardType(Greetings.HELLO)
	private GreetingCard greetingCard;

	@Inject
	@QGreetings
	@GreetingCardType(Greetings.HI)
	private GreetingCard anotherGreetingCard;

	@Test
	@InSequence(0)
	public void getGreetingCard(){
		assertNotNull(greetingCard);
	}

	@Test
	@InSequence(1)
	public void getAnotherGreetingCard() {
		assertNotNull(anotherGreetingCard);
	}

	@Test
	@InSequence(2)
	public void getGreeting() {
		assertEquals("Hello!!!", greetingCard.sayHello());
	}

	@Test
	@InSequence(3)
	public void getAnotherGreeting() {
		assertEquals("Have a nice day!!!", anotherGreetingCard.sayHello());
	}
}
