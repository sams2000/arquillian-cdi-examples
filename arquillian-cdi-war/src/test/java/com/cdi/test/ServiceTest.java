package com.cdi.test;

import static org.junit.Assert.*;

import org.jboss.arquillian.junit.InSequence;
import org.junit.Test;

import com.cdi.bean.Service;

import javax.inject.Inject;
/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
public class ServiceTest extends AbstractArquillianTest {
	@Inject
	private Service service;
    
    @Test
    @InSequence(0)
    public void getService(){
    	assertNotNull(service);
    }
    
    @Test
    @InSequence(1)
    public void getServiceValue() {
    	assertEquals(7, service.doWork(4, 3));
   	} 
}
