package com.hmbn.SpringVO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hmbn.SpringVO.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}