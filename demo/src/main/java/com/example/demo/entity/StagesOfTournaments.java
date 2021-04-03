package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "stages_of_tournaments")
public class StagesOfTournaments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stageId;

    @Column(name = "stage_name")
    private String stageName;

//    @OneToMany (mappedBy="stages_of_tournaments", fetch=FetchType.EAGER)
//    private Collection<Matches> matchesCollection;

    public StagesOfTournaments(Long stageId, String stageName) {
        this.stageId = stageId;
        this.stageName = stageName;
    }

    public StagesOfTournaments() {

    }

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
}
