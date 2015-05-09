package com.cdi.lib;
/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */

import javax.ejb.Startup;
import javax.inject.Singleton;

import com.cdi.lib.annotation.QSCM;
@QSCM
@Startup
@Singleton
public class ServiceImpl2 extends ServiceAbstract {

	public ServiceImpl2() {
		super(new String("TESTING QSCM"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public int sum(int a, int b) {
		return a+b+2;
	}

}
