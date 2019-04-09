package com.capgemini.spring.test;

import com.capgemini.spring.organization.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.context.annotation.*;


public class Test{

	public static void main(String args[]){
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Organization organization =context.getBean(Organization.class);
		System.out.println("Welcome to organization");
		System.out.println(organization.toString());
	}

}