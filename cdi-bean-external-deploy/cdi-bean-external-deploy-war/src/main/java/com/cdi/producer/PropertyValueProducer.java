package com.cdi.producer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.ejb.Startup;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.inject.Singleton;

import com.cdi.annotation.QCurrentValue;
import com.cdi.annotation.QValue;
import com.cdi.annotation.Value;
import com.cdi.lib.Service;

/**
 * @author WalmartLabs
 * @author Bin Zhou [ bzhou3@walmartlabs.com ]
 */
@Startup
@Singleton
public class PropertyValueProducer {
	@Inject
	private Service service;
	
	@Produces 
	@QValue 
	public String getPropertyValueByKey(InjectionPoint ip) throws IOException {
		Properties props = new Properties();
		//props.load(getClass().getResourceAsStream("/test/applib1.properties"));
		props.load(getClass().getResourceAsStream("/applib.properties"));
		//props.load(getClass().getResourceAsStream("./src/main/resources/appwar.properties"));
		
		System.out.println(props.toString());
		Annotated gtAnnotated = ip.getAnnotated();
		Value gtAnnotation = gtAnnotated.getAnnotation(Value.class);
		String configKey = gtAnnotation.value();
		String configValue = props.getProperty(configKey);
		
		if (configValue == null || configValue.equals("")){
			//process system property etc
			configValue = "TEST";
		}
		
		return configValue;
	}
	
	@Produces
	@QCurrentValue
	public int getCurrentValue(){
		 return service.doWork(2, 2);
	}
}
