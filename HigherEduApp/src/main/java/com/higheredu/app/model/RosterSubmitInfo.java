package com.higheredu.app.model;

public class RosterSubmitInfo {
    private Long rosterColumnId;
    private Boolean isSubmitted;
    private String graderId;
    // Getters and Setters
    public Long getRosterColumnId() {
        return rosterColumnId;
    }
    public void setRosterColumnId(Long rosterColumnId) {
        this.rosterColumnId = rosterColumnId;
    }
    public Boolean getIsSubmitted() {
        return isSubmitted;
    }
    public void setIsSubmitted(Boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }
    public String getGraderId() {
        return graderId;
    }
    public void setGraderId(String graderId) {
        this.graderId = graderId;
    }
}
 
