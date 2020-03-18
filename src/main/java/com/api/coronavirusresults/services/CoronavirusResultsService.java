package com.api.coronavirusresults.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.coronavirusresults.model.Country;
import com.api.coronavirusresults.repository.CoronavirusResultsRepository;

@Service
public class CoronavirusResultsService {

	private CoronavirusResultsRepository coronavirusResultsRepository;

	public CoronavirusResultsService(CoronavirusResultsRepository coronavirusResultsRepository) {
		this.coronavirusResultsRepository = coronavirusResultsRepository;

	}

	public Country testDataBaseById(String id) {
		Optional<Country> country = coronavirusResultsRepository.findById(id);
		return country.get();

	}

}
