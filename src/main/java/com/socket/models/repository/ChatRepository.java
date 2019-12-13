package com.socket.models.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.socket.models.documents.Message;

public interface ChatRepository extends MongoRepository<Message, String>{

	public List<Message> findFirst10ByOrderByDateDesc();
	
}
