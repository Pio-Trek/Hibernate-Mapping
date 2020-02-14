package io.spring.hibernatemapping.oneToMany.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    // For bidirectional mapping
/*    @OneToMany(mappedBy = "author")
    @ToString.Exclude
    private Set<Article> articles = new HashSet<>();*/


}
