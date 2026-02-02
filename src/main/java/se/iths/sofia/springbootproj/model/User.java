package se.iths.sofia.springbootproj.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String email;
    private int age;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Product> products;

}
