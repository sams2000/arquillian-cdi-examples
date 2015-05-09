package com.cdi.bean.impl;

import com.cdi.bean.Message;

public class EmailMessageImpl implements Message {

	@Override
	public String sendMessage() {
		return "Sending email message";
	}

}
