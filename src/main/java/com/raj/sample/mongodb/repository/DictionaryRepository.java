package com.raj.sample.mongodb.repository;

import com.raj.sample.mongodb.domain.WordDefinition;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DictionaryRepository extends MongoRepository<WordDefinition, String> {

    WordDefinition[] findByWord(String word);

}
