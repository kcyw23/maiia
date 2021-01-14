package com.maiia.api.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Text {
	@Id
	private Integer id;
	private Integer userId;
	private String title;
	private String body;

}
