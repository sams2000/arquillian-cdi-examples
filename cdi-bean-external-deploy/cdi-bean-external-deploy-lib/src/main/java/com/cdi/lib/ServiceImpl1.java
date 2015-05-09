package com.cdi.lib;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Default;

/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
@Default
public class ServiceImpl1 extends ServiceAbstract {

	@PostConstruct
	public void init(){
		
	}
	
	public ServiceImpl1() {
		super(new String("TESTING DEFAULT"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public int sum(int a, int b) {
		return a+b+1;
	}

}
