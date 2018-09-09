package com.fred.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fred.customer.dal.entities.Customer;
import com.fred.customer.dal.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testCreateCustomer() {
		
		Customer customer = new Customer();
		customer.setName("Fred");
		customer.setEmail("fred@gmail.com");
		
		
		customerRepository.save(customer);
	}
	
	@Test
	public void testFindCustomerById() {
		Customer customer = customerRepository.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findById(1l).get();
		customer.setEmail("fw@gmail.com");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void testDeleteCustomer() {
		// Without Customer Object
		customerRepository.deleteById(1l);
		
		// With Customer Object
//		Customer customer = new Customer();
//		customer.setId(1l);
//		customerRepository.delete(customer);
	}
}
