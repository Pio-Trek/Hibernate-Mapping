package io.spring.hibernatemapping.manyToMany.repository;

import io.spring.hibernatemapping.manyToMany.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
