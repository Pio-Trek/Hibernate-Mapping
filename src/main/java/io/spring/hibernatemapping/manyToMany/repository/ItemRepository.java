package io.spring.hibernatemapping.manyToMany.repository;

import io.spring.hibernatemapping.manyToMany.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
