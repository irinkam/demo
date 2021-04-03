package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "fouls_types")
public class FoulsTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foulCode;

    @Column(name = "foul_type")
    private String foulType;

    public FoulsTypes(Long foulCode, String foulType) {
        this.foulCode = foulCode;
        this.foulType = foulType;
    }

    public FoulsTypes() {

    }

    public Long getFoulCode() {
        return foulCode;
    }

    public void setFoulCode(Long foulCode) {
        this.foulCode = foulCode;
    }
}
