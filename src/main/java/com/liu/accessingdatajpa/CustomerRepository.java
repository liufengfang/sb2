package com.liu.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by liufengfang on 2019/10/12.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
