package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1stAppApplication {

	public static void main(String[] args) {
		//with out object name 
		/*
		 * ApplicationContext
		 * ac=SpringApplication.run(SpringBoot1stAppApplication.class, args); MyMessage
		 * m=ac.getBean("myMessage",MyMessage.class); m.welcome();
		 */
		// with object name
	     ApplicationContext ac=SpringApplication.run(SpringBoot1stAppApplication.class, args);
		    MyMessage_msg m=ac.getBean("msg",MyMessage_msg.class);
		    m.welcome();
	}

}
