package com.eighteengray.designpatternslib.bridge.example6;
/**
 * 以站内短消息的方式发送消息
 */
public  class MessageSMS implements MessageImplementor{

	public void send(String message, String toUser) {
		System.out.println("使用站内短消息的方式，发送消息'"+message+"'给"+toUser);
	}
}
