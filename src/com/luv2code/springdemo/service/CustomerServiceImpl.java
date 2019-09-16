package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.DAO.CustomerDAO;
import com.luv2code.springdemo.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getCustomers() {

		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);

	}

	@Override
	public Customer getForupdate(Integer id) {
		
		return customerDAO.getgetForupdate(id);
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerDAO.deleteCustomer(id);
		
	}



	/*
	 * @Override public Customer updateCustomers(Integer id, Customer customer) { //
	 * TODO Auto-generated method stub return customerDAO.updateCustomers(id,
	 * customer); }
	 * 
	 * @Override public void updatesCustomer(Customer customer) {
	 * 
	 * customerDAO.updatesCustomer(customer); }
	 */

}
