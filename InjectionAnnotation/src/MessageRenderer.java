package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class MessageRenderer{

	//@Autowired 
	private MessageProvider messageProvider;
	
	//For Construction Injection Using Annotation
	/*@Autowired
	public MessageRenderer(MessageProvider messageProvider)
	{	
		this.messageProvider = messageProvider;
	}*/
	
	//For Setter Injection Using Annotation
	@Autowired
	@Qualifier("hello")
	public void setMessageProvider(MessageProvider messageProvider)
	{	
		this.messageProvider = messageProvider;
	}

	public void render(){
		messageProvider.getMessage();	

	}
}