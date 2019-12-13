package com.socket.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socket.models.documents.Message;
import com.socket.models.repository.ChatRepository;

@Service
public class ChatServiceImpl implements ChatService {

	private ChatRepository chatRepository;
	
	@Autowired
	public ChatServiceImpl(ChatRepository chatRepository) {
		this.chatRepository = chatRepository;
	}
	
	@Override
	public List<Message> getLastTenMessages() {
		return this.chatRepository.findFirst10ByOrderByDateDesc();
	}

	@Override
	public Message save(Message message) {
		return this.chatRepository.save(message);
	}

}
