package com.higheredu_api.grading_service.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roster_catalog")
public class RosterCatalogInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rosterCatalogId;

    private String name;

    private String description;

    @Column(name = "type_key")
    private String typeKey;

    @Column(name = "state_key")
    private String stateKey;

    // Constructor
    public RosterCatalogInfo() {
    }

    // Getters and Setters
    public Long getRosterCatalogId() {
        return rosterCatalogId;
    }

    public void setRosterCatalogId(Long rosterCatalogId) {
        this.rosterCatalogId = rosterCatalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getStateKey() {
        return stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }
}
