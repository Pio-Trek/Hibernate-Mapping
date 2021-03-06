package io.spring.hibernatemapping.oneToMany.repository;

import io.spring.hibernatemapping.oneToMany.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
