package com.snort.intelli.app.repository;

import com.snort.intelli.app.entites.Todos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TodosRepository extends CrudRepository<Todos, Long> {
}
