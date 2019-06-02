package com.qst.service.impl;

import com.qst.bean.Customer;
import com.qst.mapper.CustomerMapper;
import com.qst.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll() {

        return customerMapper.findAll();
    }

    @Override
    public void save(Customer customer) {

        if (customer.getId()!=null){
            //修改
            customerMapper.update(customer);
        }else{
                //保存
                this.customerMapper.insert(customer);
             }

    }

    @Override
    public Customer findById(Integer id) {
        return customerMapper.findById(id);
    }

    @Override
    public void delete(Integer[] id) {
        customerMapper.delete(id);
    }
}
