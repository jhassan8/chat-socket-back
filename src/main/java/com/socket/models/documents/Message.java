package com.socket.models.documents;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 5317405450141720025L;

	private String message;
	private Long date;
	private String username;
	private String type;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
