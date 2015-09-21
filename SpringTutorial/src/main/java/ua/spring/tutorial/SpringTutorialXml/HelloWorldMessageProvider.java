package ua.spring.tutorial.SpringTutorialXml;

import ua.spring.tutorial.SpringTutorial.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider{
	
	public String getMessage(){
		return "Hello world!:)";
	}

}
