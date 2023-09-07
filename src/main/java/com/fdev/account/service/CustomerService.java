package com.fdev.account.service;

import com.fdev.account.exceptions.CustomerNotFoundException;
import com.fdev.account.model.Customer;
import com.fdev.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).
                orElseThrow(()->new CustomerNotFoundException("Customer could not found by id: " + id));
    }


}
