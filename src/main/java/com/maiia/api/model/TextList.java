package com.maiia.api.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TextList {

	private List<Text> texts;

	public TextList() {
		this.texts = new ArrayList<>();
	}

	public List<Text> getTexts() {
		return texts;
	}

	public void setTexts(List<Text> texts) {
		this.texts = texts;
	}
	
	public void firstFifty() {
		this.texts = this.texts.subList(0, 50);
	}
	
	public void sortByTitle() {
		this.texts.sort(Comparator.comparing(Text::getTitle));
	}

	@Override
	public String toString() {
		return texts.stream().map(t -> t.toString()).collect(Collectors.joining(","));
	}	
	
}
