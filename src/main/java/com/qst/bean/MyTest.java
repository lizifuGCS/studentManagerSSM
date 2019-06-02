/*
package com.qst.bean;

import com.qst.bean.Customer;
import com.qst.mapper.CustomerMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;


public class MyTest {

    @Autowired
    private CustomerMapper customerMapper;

    Customer customer = new Customer();
    @Test
    public void add(){

        for (int i = 0; i < 20; i++) {

            customer.setName("李自富"+i);
            customer.setTelephone("李自富:1786298760"+i);
            for (int j = 0; j <20 ; j++) {
                if(j%2==0)
                    customer.setGender("男");
                else
                    customer.setGender("女");
            }
            customerMapper.insert(customer);

        }
    }
}
*/
