package ua.spring.tutorial.SpringTutorialAnnotations;

import org.springframework.stereotype.Service;
import ua.spring.tutorial.SpringTutorial.MessageProvider;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider{
	
	public String getMessage(){
		return "Hello world!:)";
	}

}
