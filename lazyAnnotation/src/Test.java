package com.capgemini.spring.test;
import com.capgemini.spring.render.*; 
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test{
	public static void  main(String args[]){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("context.xml");
		System.out.println("Main...");
		MessageRender render=(MessageRender)ctx.getBean("messageRender");
		render.displayMessage();
		MessageRender render1=(MessageRender)ctx.getBean("messageRender");

		if(render.equals(render1)){
			System.out.println("Singleton..");
		}else{
			System.out.println("Not Singleton..");
		}
	}
}