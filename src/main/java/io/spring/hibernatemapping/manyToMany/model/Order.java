package io.spring.hibernatemapping.manyToMany.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "orders") // Custom table name, as H2DB reserved "ORDER" as a keyword
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "order_date")
    @NonNull
    private LocalDateTime orderDate;

    @NonNull
    private BigDecimal amount;

    @ManyToMany(mappedBy = "orders")
    private List<Item> items = new ArrayList<>();

}
