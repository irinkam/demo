package com.example.demo.entity;

import javax.persistence.*;

@Entity

@Table(name = "fouls")
public class Fouls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foulCode;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "time")
    private String time;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "match_id")
    private Matches match;

    public Fouls(){}


    public Fouls(Long foulCode, String playerName, String time) {
        this.foulCode = foulCode;
        this.playerName = playerName;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getFoulCode() {
        return foulCode;
    }

    public void setFoulCode(Long foulCode) {
        this.foulCode = foulCode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
