package com.cdi.bean.impl;

import com.cdi.bean.Message;

public class SmsMessageImpl implements Message {

	@Override
	public String sendMessage() {
		return "Sending SMS message";
	}

}
