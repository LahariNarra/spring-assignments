package com.capgemini.spring.provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("provider1")
public class HWMessageProvider implements MessageProvider{

	public String getMessage(){
		return "Hello World...!!";
	}
}