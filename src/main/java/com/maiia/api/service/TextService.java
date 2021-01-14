package com.maiia.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiia.api.model.Text;
import com.maiia.api.model.TextList;
import com.maiia.api.repository.TextRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service()
public class TextService {

	@Autowired
	private TextRepository textRepository;

	public List<Text> getAll() {
		List<Text> texts = new ArrayList<Text>();
		textRepository.findAll().forEach(texts::add);
		return texts;
	}

	public void processData(Text[] texts) {
		TextList list = new TextList();
		list.setTexts(Arrays.asList(texts));
		list.firstFifty();
		list.sortByTitle();
		textRepository.saveAll(list.getTexts());
	}
}