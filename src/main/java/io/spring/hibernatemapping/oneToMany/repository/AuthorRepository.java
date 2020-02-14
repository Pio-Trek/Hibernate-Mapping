package io.spring.hibernatemapping.oneToMany.repository;

import io.spring.hibernatemapping.oneToMany.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
