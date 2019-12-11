package com.socket.controllers;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.socket.models.documents.Message;

@Controller
public class ChatController {
	
	@MessageMapping("/message")
	@SendTo("/chat/message")
	public Message receiveMessage( Message message ) {
		message.setDate(new Date().getTime());
		message.setMessage("receive: " + message.getMessage());
		
		return message;
	}

}
