package com.api.coronavirusresults.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.coronavirusresults.model.Country;
import com.api.coronavirusresults.services.CoronavirusResultsService;

@RestController
@RequestMapping(value = "/requestinformation")
public class CoronavirusResultsController {

	private CoronavirusResultsService coronavirusResultsService;

	public CoronavirusResultsController(CoronavirusResultsService coronavirusResultsService) {
		this.coronavirusResultsService = coronavirusResultsService;

	}

	@GetMapping("/country")
	public String returnHello() {
		return "Hello Mexico :)";
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public Country returnHello(@PathVariable String id) {
		return coronavirusResultsService.testDataBaseById(id);
	}

}
