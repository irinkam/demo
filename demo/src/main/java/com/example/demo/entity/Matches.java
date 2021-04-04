package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "matches")
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchId;

    @Column(name = "date")
    private Date date;

    @Column(name = "first_team_goals")
    private Integer firstTeamGoals;

    @Column(name = "second_team_goals")
    private Integer secondTeamGoals;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "stadium_id")
    private Stadiums stadium;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "tournament_id")
    private Tournaments tournament;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name = "stage_id")
    private StagesOfTournaments stage;

    @OneToMany (fetch=FetchType.EAGER)
    private Collection<Fouls> foulsCollection;

    public Matches(Long matchId, Date date, Integer firstTeamGoals, Integer secondTeamGoals, Stadiums stadium) {
        this.matchId = matchId;
        this.date = date;
        this.firstTeamGoals = firstTeamGoals;
        this.secondTeamGoals = secondTeamGoals;
        this.stadium = stadium;
    }

    public Matches() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getFirstTeamGoals() {
        return firstTeamGoals;
    }

    public void setFirstTeamGoals(Integer firstTeamGoals) {
        this.firstTeamGoals = firstTeamGoals;
    }

    public Integer getSecondTeamGoals() {
        return secondTeamGoals;
    }

    public void setSecondTeamGoals(Integer secondTeamGoals) {
        this.secondTeamGoals = secondTeamGoals;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Stadiums getStadium() {
        return stadium;
    }

    public void setStadium(Stadiums stadium) {
        this.stadium = stadium;
    }

    public Tournaments getTournament() {
        return tournament;
    }

    public void setTournament(Tournaments tournament) {
        this.tournament = tournament;
    }

    public StagesOfTournaments getStage() {
        return stage;
    }

    public void setStage(StagesOfTournaments stage) {
        this.stage = stage;
    }
}
