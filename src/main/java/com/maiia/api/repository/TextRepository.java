package com.maiia.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.maiia.api.model.Text;

public interface TextRepository extends MongoRepository<Text, Integer> {

}
