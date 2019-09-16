package com.luv2code.springdemo.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {

		// define session factory
		Session CurrentSession = sessionFactory.getCurrentSession();

		// define query
		Query<Customer> theQuery = CurrentSession.createQuery("from Customer", Customer.class);

		// get result
		List<Customer> theResult = theQuery.getResultList();
		return theResult;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// define session factory
		Session CurrentSession = sessionFactory.getCurrentSession();
		CurrentSession.saveOrUpdate(customer);
	}

	@Override
	public Customer getgetForupdate(Integer id) {
		Session CurrentSession = sessionFactory.getCurrentSession();
		Customer getUpdate = CurrentSession.get(Customer.class, id);
		return getUpdate;
	}

	@Override
	public void deleteCustomer(Integer id) {
		
		Session CurrentSession = sessionFactory.getCurrentSession();
		Customer getUpdate = CurrentSession.get(Customer.class, id);
		CurrentSession.delete(getUpdate);
		
	}

}
