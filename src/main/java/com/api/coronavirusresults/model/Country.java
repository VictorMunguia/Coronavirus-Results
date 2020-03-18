package com.api.coronavirusresults.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "results")
@Data
public class Country {

	@Id
	private String id;

	private String name;

	private Integer number_infected;

}
