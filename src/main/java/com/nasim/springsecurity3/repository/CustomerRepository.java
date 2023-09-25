package com.nasim.springsecurity3.repository;

import com.nasim.springsecurity3.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nasimkabir
 * ২৫/৯/২৩
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    List<Customer> findByEmail(String email);
}
