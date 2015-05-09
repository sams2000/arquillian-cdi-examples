package com.cdi.lib;
/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
public abstract class ServiceAbstract implements Service {

	public String message;
	
	public ServiceAbstract(String msg){
		this.message = msg;
	}
	
	@Override
	public int doWork(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b){
		return a+b;
	}
}
