package com.socket.models.documents;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 5317405450141720025L;

	private String message;
	private Long date;

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

}
