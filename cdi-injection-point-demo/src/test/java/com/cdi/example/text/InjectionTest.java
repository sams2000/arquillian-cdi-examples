package com.cdi.example.text;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.jboss.arquillian.junit.InSequence;
import org.junit.Test;
import org.slf4j.Logger;

import com.cdi.example.ConfigurationStringValue;
import com.cdi.example.QConfigurationKeyValue;

/**
 * This testing case is verified on 2015-02-11
 * @author Bin Zhou
 *
 */
public class InjectionTest extends AbstractArquillianTest {
	@Inject
	@QConfigurationKeyValue
	@ConfigurationStringValue(configListName="checkout", configKey="p3", configValue = "p3-value5" )
	private String p3;

	@Inject
	private Logger log;

	@Test
	@InSequence(0)
	public void getConfig(){
		assertNotNull(p3);
	}

	@Test
	@InSequence(1)
	public void getConfigListName() {
		assertEquals("checkout", p3);
	}

	@Test
	@InSequence(2)
	public void getLogger(){
		assertNotNull(log);
	}
}
