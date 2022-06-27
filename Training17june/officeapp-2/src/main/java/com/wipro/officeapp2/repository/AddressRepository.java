package com.wipro.officeapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.officeapp2.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
