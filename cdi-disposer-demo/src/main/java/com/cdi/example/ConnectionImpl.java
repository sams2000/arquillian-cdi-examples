package com.cdi.example;

public class ConnectionImpl implements Connection {

	@Override
	public void connect() {
		System.out.println("Connecting...");
	}

	@Override
	public void closeConnection() {
		System.out.println("Closing connection...");
	}

}
