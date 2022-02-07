package com.example.creditapplication;

import com.example.creditapplication.customer.Customer;
import com.example.creditapplication.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {

    private CustomerService customers;

    @Autowired
    public Controller(CustomerService customers) {
        this.customers = customers;
    }

    @PostMapping("/customer")
    public Customer createCustomer(Customer customer) {
        return customers.save(customer);
    }
    @PostMapping("/customer/search/{pesel}")
    public Map<String, Iterable<Customer>> getCustomerByPesel(@PathVariable String pesel) {
        Map<String, Iterable<Customer>> customersMap = new HashMap<String, Iterable<Customer>>();
        customersMap.put("searchResult", customers.customerGetByPesel(pesel));
        return customersMap;
    }

    @GetMapping("/customer")
    public Map<String, Iterable<Customer>> getCustomers() {
        Map<String, Iterable<Customer>> customersMap = new HashMap<String, Iterable<Customer>>();
        customersMap.put("searchResult", customers.findAll());
        return customersMap;
    }
}
