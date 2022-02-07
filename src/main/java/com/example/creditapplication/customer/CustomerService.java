package com.example.creditapplication.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> findCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Iterable<Customer> customerGetByPesel(String pesel) {
        return customerRepository.findByPesel(pesel);
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDatabase() {
        save(new Customer("Nikodem", "Godek", 0, "98122905176"));
        save(new Customer("Nikodem", "Godek", 1, "98122905175"));
    }
}
