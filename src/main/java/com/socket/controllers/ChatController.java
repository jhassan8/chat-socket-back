package com.socket.controllers;

import java.util.Date;
import java.util.Random;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.socket.models.documents.Message;
import com.socket.models.service.ChatService;

@Controller
public class ChatController {

	private String[] colors = { "red", "green", "blue", "yellow", "orange", "violet" };
	private ChatService chatService;

	public ChatController(ChatService chatService) {
		this.chatService = chatService;
	}

	@MessageMapping("/message")
	@SendTo("/chat/message")
	public Message receiveMessage(Message message) {
		message.setDate(new Date().getTime());

		if (message.getType().equals("CONNECTED")) {
			message.setColor(colors[new Random().nextInt(colors.length)]);
			message.setMessage(message.getUsername() + " has been connected.");
		} else {
			this.chatService.save(message);
		}

		return message;
	}

	@MessageMapping("/writing")
	@SendTo("/chat/writing")
	public String writing(String username) {
		return username + " is writing..";
	}

}
