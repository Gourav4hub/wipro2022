package com.wipro.officeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.officeapp.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
