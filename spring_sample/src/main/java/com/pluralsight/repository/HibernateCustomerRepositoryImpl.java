package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

		/* (non-Javadoc)
		 * @see com.pluralsight.repository.CustomerRepository#findall()
		 */
		@Override
		public List<Customer> findall() {
			List<Customer> customers = new ArrayList<>();
			
			Customer customer = new Customer();
			customer.setFirstname("Hiltsje");
			customer.setLastname("Smilde");
			
			customers.add(customer);
			
			return customers;	
		}
}
