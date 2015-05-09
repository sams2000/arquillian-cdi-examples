package com.cdi.test;

import static org.junit.Assert.*;

import org.jboss.arquillian.junit.InSequence;
import org.junit.Test;

import com.cdi.annotation.QValue;
import com.cdi.annotation.Value;

import javax.inject.Inject;
/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
public class PropertyValueTest extends AbstractArquillianTest {
	@Inject
	@QValue
	@Value("app.prop.1")
	private String configValue;
    
    @Test
    @InSequence(0)
    public void checkPropertyValue(){
    	assertNotNull(configValue);
    }
    
    @Test
    @InSequence(1)
    public void getPropertyValue() {
    	assertEquals("lib1", configValue);
   	} 
}
