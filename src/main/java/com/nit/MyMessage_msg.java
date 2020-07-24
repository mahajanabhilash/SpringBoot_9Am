package com.nit;

import org.springframework.stereotype.Component;

@Component("msg")
public class MyMessage_msg {

	public void welcome() {
		System.out.println("Welcome to first app with object name");
	}
}
