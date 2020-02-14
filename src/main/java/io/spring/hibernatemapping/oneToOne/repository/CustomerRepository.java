package io.spring.hibernatemapping.oneToOne.repository;

import io.spring.hibernatemapping.oneToOne.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
