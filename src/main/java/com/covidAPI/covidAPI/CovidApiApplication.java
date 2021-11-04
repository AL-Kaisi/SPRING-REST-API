package com.covidAPI.covidAPI;

import com.covidAPI.covidAPI.model.Headers;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@SpringBootApplication
public class CovidApiApplication {
	private static final Logger log = LoggerFactory.getLogger(CovidApiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CovidApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {

		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		return restTemplate;
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {


		return args -> {
			Headers quote = restTemplate.getForObject(
					"https://api.coronavirus.data.gov.uk/v1/data?%27%27filters=areaType=nation;areaName=england", Headers.class);
			log.info(quote.toString());
		};
	}

}


