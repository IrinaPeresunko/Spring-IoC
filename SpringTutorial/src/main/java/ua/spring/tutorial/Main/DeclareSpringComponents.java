package ua.spring.tutorial.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ua.spring.tutorial.SpringTutorial.MessageProvider;

public class DeclareSpringComponents {
	
	public static void main(String[] args){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
		//ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();		
		
		MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);

		System.out.println(messageProvider.getMessage());
	}
}
