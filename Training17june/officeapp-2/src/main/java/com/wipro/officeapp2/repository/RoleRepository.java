package com.wipro.officeapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.officeapp2.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
