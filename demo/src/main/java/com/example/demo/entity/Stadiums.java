package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "stadiums")
public class Stadiums {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stadiumId;

    @Column(name = "stadium_name")
    private String stadiumName;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "city")
    private String city;

//    @OneToOne(optional=false, mappedBy="stadiums")
//    private Teams ownerTeam;

//    @OneToMany (mappedBy="stadiums", fetch=FetchType.EAGER)
//    private Collection<Matches> matchesCollection;

    public Stadiums(Long stadiumId, String stadiumName, Integer capacity, String city, Teams ownerTeam) {
        this.stadiumId = stadiumId;
        this.stadiumName = stadiumName;
        this.capacity = capacity;
        this.city = city;
//        this.ownerTeam = ownerTeam;
    }

    public Stadiums() {

    }
}
