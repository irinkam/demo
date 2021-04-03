package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "country")
    private String country;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "stadium_id")
    private Stadiums homeStadium;

    public Teams(Long teamId, String teamName, String country) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.country = country;
    }

    public Teams() {

    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Stadiums getHomeStadium() {
        return homeStadium;
    }

    public void setHomeStadium(Stadiums homeStadium) {
        this.homeStadium = homeStadium;
    }
}
