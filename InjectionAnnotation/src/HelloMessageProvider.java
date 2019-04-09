package com.capgemini.spring.provider;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloMessageProvider implements MessageProvider{
	@Override
	public void getMessage(){
		System.out.println("Hello World");
	}
}