package io.spring.hibernatemapping.oneToOne.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NonNull
    private String address;

    @NonNull
    private String city;

    @NonNull
    private String country;

    @NonNull
    private String postCode;

    @NonNull
    private LocalDate dob;

    // For bidirectional mapping
/*    @OneToOne(mappedBy = "profile")
    @ToString.Exclude
    private Customer customer;*/
}
