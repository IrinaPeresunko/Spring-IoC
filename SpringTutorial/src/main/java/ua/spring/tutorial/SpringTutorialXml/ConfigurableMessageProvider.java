package ua.spring.tutorial.SpringTutorialXml;

import ua.spring.tutorial.SpringTutorial.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {

    private String message;
    
    public ConfigurableMessageProvider() {
    }
    
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}