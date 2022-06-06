package com.wipro.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.boot.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>
{

}
