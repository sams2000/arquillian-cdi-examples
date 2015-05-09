package com.cdi.test;

import static org.junit.Assert.*;

import org.jboss.arquillian.junit.InSequence;
import org.junit.Test;

import com.cdi.annotation.QCurrentValue;
import com.cdi.lib.Service;
import com.cdi.lib.ServiceAbstract;
import com.cdi.lib.ServiceImpl1;
import com.cdi.lib.annotation.QSCM;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
public class ServiceTest extends AbstractArquillianTest {
	@Inject
	@Default
	private ServiceAbstract service1;
	
	@Inject
	@QSCM
	private Service service2;
    
    @Inject
    @QCurrentValue
    private int currentValue;
	
	@Test
    @InSequence(0)
    public void getService(){
    	assertNotNull(service1);
    }
    
    @Test
    @InSequence(1)
    public void getServiceValue() {
    	assertEquals(5, service1.doWork(2, 3));
   	} 
    
    @Test
    @InSequence(2)
    public void getSumValue() {
    	assertEquals(7, service1.sum(3, 3));
    	assertEquals("TESTING DEFAULT", service1.message);
   	} 
    
    @Test
    @InSequence(3)
    public void getSumPlusValue() {
    	assertEquals(8, service2.sum(3, 3));
   	} 
    
    @Test
    @InSequence(3)
    public void getCurrentValue() {
    	assertEquals(4, currentValue);
   	} 
}
