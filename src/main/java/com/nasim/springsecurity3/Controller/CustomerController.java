package com.nasim.springsecurity3.Controller;

import com.nasim.springsecurity3.domain.Customer;
import com.nasim.springsecurity3.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nasimkabir
 * ২৫/৯/২৩
 */
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
        log.info("Customer: {}", customer);
        customer.setPwd(passwordEncoder.encode(customer.getPwd()));
        customerRepository.save(customer);
        return new ResponseEntity<>("User saved successfully", HttpStatus.CREATED);
    }
}
