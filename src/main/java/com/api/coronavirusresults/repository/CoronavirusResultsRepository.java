package com.api.coronavirusresults.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.coronavirusresults.model.Country;

@Repository
public interface CoronavirusResultsRepository extends MongoRepository<Country, String> {

}
