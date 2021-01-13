package com.maiia.api.model;

import org.springframework.data.annotation.Id;

public class Text {
	@Id
	private Integer id;
	private Integer userId;
	private String title;
	private String body;

	public Text(Integer id, Integer userId, String title, String body) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Text [id=" + id + ", userId=" + userId + ", title=" + title + ", body=" + body + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
