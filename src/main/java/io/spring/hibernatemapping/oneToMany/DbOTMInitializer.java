package io.spring.hibernatemapping.oneToMany;

import io.spring.hibernatemapping.oneToMany.model.Article;
import io.spring.hibernatemapping.oneToMany.model.Author;
import io.spring.hibernatemapping.oneToMany.repository.ArticleRepository;
import io.spring.hibernatemapping.oneToMany.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DbOTMInitializer implements CommandLineRunner {

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;

    public DbOTMInitializer(ArticleRepository articleRepository, AuthorRepository authorRepository) {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Creating test db for one to many (author articles). START");

        Author john = new Author("John", "Writer");
        authorRepository.save(john);

        Article article1 = new Article(john, "Honor at the solar sphere was the devastation of alarm, attacked to a crazy transformator.");
        Article article2 = new Article(john, "Plasma at the moon that is when sub-light transporters experiment.");

        articleRepository.save(article1);
        articleRepository.save(article2);

        log.info("Creating test db for one to many (author articles). END");
    }
}
