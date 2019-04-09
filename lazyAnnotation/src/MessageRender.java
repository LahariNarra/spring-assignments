package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.*;
 
@Service("messageRender")
public class MessageRender{
    	
	public static MessageProvider provider;

	@Autowired
	@Qualifier("provider")
	public void setMessageProvider(MessageProvider provider){
		System.out.println("provider...");
		this.provider=provider;
	}

	public void displayMessage(){
		System.out.println(provider.getMessage());
	}
}