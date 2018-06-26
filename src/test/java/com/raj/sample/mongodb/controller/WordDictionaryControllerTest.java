package com.raj.sample.mongodb.controller;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.Service;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
public class WordDictionaryControllerTest {
    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(8888));

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void contextLoads() throws Exception {
        //assertThat(this.service.go()).isEqualTo("Hello World!");
    }
}