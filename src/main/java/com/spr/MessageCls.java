package com.spr;

public class MessageCls {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		System.err.println("Message bean is Initiated........");
	}
	public void destroy() {
		System.err.println("Message bean is going to destroy...........");
	}
}
