package com.cdi.example.impl;

import com.cdi.example.GreetingCard;
import com.cdi.example.GreetingCardType;
import com.cdi.example.QGreeting;

@QGreeting(GreetingCardType.HI)
public class GreetingCardImpl implements GreetingCard {

	public String sayHello() {
		return "Hello!!!";
	}

}
