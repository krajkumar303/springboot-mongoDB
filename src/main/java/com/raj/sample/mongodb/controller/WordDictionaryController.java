package com.raj.sample.mongodb.controller;

import com.raj.sample.mongodb.domain.WordDefinition;
import com.raj.sample.mongodb.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/dictionary")
public class WordDictionaryController {

    @Value("${dictionary.service.url}" )
    private String serviceURL;

    @Autowired
    private DictionaryRepository repository;

    @GetMapping(
            value = "/definitions/{word}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WordDefinition[] getWordDefinition(@PathVariable String word) {

        WordDefinition[] response = repository.findByWord(word);

        if (response.length == 0) {
            RestTemplate restTemplate = new RestTemplate();
            response =
                    restTemplate.getForObject(serviceURL.replace("{}", word), WordDefinition[].class);

            repository.saveAll(Arrays.asList(response));

        }
        for (WordDefinition wordDefinition : response) {
            System.out.println(wordDefinition);
        }

        return response;
    }
}
