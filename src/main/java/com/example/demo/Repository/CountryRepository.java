package com.example.demo.Repository;

import com.example.demo.Model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
}
