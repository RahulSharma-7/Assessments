package com.example.hibernatesession3.repository;

import com.example.hibernatesession3.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {

}
