package com.cdi.example.impl;

import com.cdi.example.GreetingCard;
import com.cdi.example.GreetingCardType;
import com.cdi.example.QGreeting;

@QGreeting(GreetingCardType.HELLO)
public class AnotherGreetingCardImpl implements GreetingCard {

	@Override
	public String sayHello() {
		return "Have a nice day!!!";
	}

}
