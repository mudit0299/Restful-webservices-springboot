package com.example.demo.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		super();
		this.message=message;
	}

	

	public HelloWorldBean() {
		
	}



	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}
	 

}
