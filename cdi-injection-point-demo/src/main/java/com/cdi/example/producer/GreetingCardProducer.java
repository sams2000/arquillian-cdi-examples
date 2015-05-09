package com.cdi.example.producer;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;

import com.cdi.example.ConfigurationStringValue;
import com.cdi.example.GreetingCard;
import com.cdi.example.GreetingCardType;
import com.cdi.example.QConfigurationKeyValue;
import com.cdi.example.QGreetings;



public class GreetingCardProducer {
	//Verfiied and it works fine
	@Produces
	@QGreetings
	public GreetingCard getGreetingCard(InjectionPoint ip) throws InstantiationException, IllegalAccessException{
		Annotated gtAnnotated = ip.getAnnotated();
		GreetingCardType gtAnnotation = gtAnnotated.getAnnotation(GreetingCardType.class);
		Class<? extends GreetingCard> greetingCard = gtAnnotation.value().getClazz();
		return greetingCard.newInstance();
	}



	//following practice doesn't work per local testing so far
//	@Produces
//	@QGreetings
//	public GreetingCard getGreetingCard(@Any Instance<GreetingCard> instance, InjectionPoint ip){
//		Annotated annotated = ip.getAnnotated();
//		GreetingCardType gcTypeAnnotation = annotated.getAnnotation(GreetingCardType.class);
//		Class<? extends GreetingCard> greetingCard = gcTypeAnnotation.value().getClazz();
//
//		return instance.select(greetingCard).get();
//	}


	@Produces
	@QConfigurationKeyValue
	public String getConfigurationValueByKey(InjectionPoint ip) {
		Annotated gtAnnotated = ip.getAnnotated();
		ConfigurationStringValue gtAnnotation = gtAnnotated.getAnnotation(ConfigurationStringValue.class);
		String configListName = gtAnnotation.configListName();
		//String configKey = gtAnnotation.configKey();


		return configListName;
	}

}