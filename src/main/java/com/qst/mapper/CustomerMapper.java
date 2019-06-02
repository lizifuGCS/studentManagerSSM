package com.qst.mapper;



import com.qst.bean.Customer;

import java.util.List;

public interface CustomerMapper {

    public List<Customer>  findAll();


    public void insert(Customer customer);

    public Customer findById(Integer id);

    public void update(Customer customer);

    public  void delete(Integer[] id);

}