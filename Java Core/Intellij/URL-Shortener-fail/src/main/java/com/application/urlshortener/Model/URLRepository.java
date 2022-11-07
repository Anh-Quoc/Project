package com.application.urlshortener.Model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends MongoRepository<URL, String> {
}
