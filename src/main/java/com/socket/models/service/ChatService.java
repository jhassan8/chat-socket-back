package com.socket.models.service;

import java.util.List;

import com.socket.models.documents.Message;

public interface ChatService {

	public List<Message> getLastTenMessages();
	public Message save(Message message);
}
