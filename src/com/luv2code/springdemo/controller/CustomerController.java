package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.luv2code.springdemo.model.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCutomers(Model model) {

		List<Customer> listCustomers = customerService.getCustomers();
		model.addAttribute("listCustomers", listCustomers);

		return "listCustomers";
	}

	@GetMapping("/add")
	public String link(Model model) {
		Customer customer = new Customer();
		model.addAttribute("add", customer);
		return "customerForm";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("add") Customer customer) {

		customerService.saveCustomer(customer);

		return "redirect:/customer/list";
	}

	@GetMapping("/FormUpdate")
	public String CustomerUpdate(@RequestParam("customerId") Integer id, Model model) {
		Customer getCustomer = customerService.getForupdate(id);
		model.addAttribute("add", getCustomer);
		return "customerUpdate";
	}
	
	//delete customer
	@GetMapping("/delete")
	public String CustomerDelete(@RequestParam("customerId") Integer id) {
		
		customerService.deleteCustomer(id);
		
		return "redirect:/customer/list";
		
	}
	
	

}
