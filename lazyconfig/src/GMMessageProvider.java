package com.capgemini.spring.provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class GMMessageProvider implements MessageProvider{

	public String getMessage(){
		return "Good Morning...!!";
	}
}