package com.hmbn.SpringVO.repositories;

import com.hmbn.SpringVO.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}