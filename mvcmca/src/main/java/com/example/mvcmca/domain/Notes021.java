package com.example.mvcmca.domain;

import javax.persistence.*;

@Entity
public class Notes021 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String notes;

    @OneToOne
    private Recipe021 recipe;
}
