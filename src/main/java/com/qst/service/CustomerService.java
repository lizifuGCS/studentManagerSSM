package com.qst.service;

import com.qst.bean.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {

    public List<Customer> findAll();


    public void save(Customer customer);

   public Customer findById(Integer id);

   public void delete(Integer[] id);
}
