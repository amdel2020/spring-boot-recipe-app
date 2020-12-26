package com.amit.recipeapp.repositories;

import com.amit.recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Integer> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
