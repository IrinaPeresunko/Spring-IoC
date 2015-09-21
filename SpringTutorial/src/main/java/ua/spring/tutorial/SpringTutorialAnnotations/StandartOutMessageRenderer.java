package ua.spring.tutorial.SpringTutorialAnnotations;

import org.springframework.stereotype.Service;

import ua.spring.tutorial.SpringTutorial.MessageProvider;
import ua.spring.tutorial.SpringTutorial.MessageRenderer;

@Service("messageRenderer")
public class StandartOutMessageRenderer implements MessageRenderer{
	private MessageProvider messageProvider = null;
	
	public void render() {
		if(messageProvider==null){
			throw new RuntimeException(
				"You must set the property messageProvider of class:"
			+StandartOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
		
	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
	

}
