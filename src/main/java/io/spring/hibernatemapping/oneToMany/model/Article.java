package io.spring.hibernatemapping.oneToMany.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    // For bidirectional mapping
/*    @ManyToOne
    @NonNull
    private Author author;*/

    // For unidirectional mapping
    @ManyToOne
    @JoinColumn(name = "author_id")
    @NonNull
    private Author author;

    @NonNull
    private String article;

}
