package com.example.getarray.repository;

import com.example.getarray.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpaRepositoryEmployee extends JpaRepository<Employee,Integer> {

}
