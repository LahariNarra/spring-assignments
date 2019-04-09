package com.capgemini.spring.provider;

import org.springframework.stereotype.Component;

@Component("gMorning")
public class GMorningMessageProvider implements MessageProvider{
	
	@Override
	public void getMessage(){
		System.out.println("Good Morning");
	}
}