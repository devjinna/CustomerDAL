package com.fred.customer.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.fred.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
