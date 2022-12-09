package com.example.getarray.repository;

import com.example.getarray.model.Account;
import com.example.getarray.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName (String name);
}
