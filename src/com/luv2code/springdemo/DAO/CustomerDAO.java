package com.luv2code.springdemo.DAO;

import java.util.List;

import com.luv2code.springdemo.model.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getgetForupdate(Integer id);
	public void deleteCustomer(Integer id);

}
