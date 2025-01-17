package com.higheredu_api.grading_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roster_result")
public class RosterResult {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rosterId;
    private String atpId;
    private String name;
    private String discription;
    private Long rosterRowId;
    private Long rosterColumnId;
    private String state;
    private String type;
    private String grade;
	public Long getRosterId() {
		return rosterId;
	}
	public void setRosterId(Long rosterId) {
		this.rosterId = rosterId;
	}
	public String getAtpId() {
		return atpId;
	}
	public void setAtpId(String atpId) {
		this.atpId = atpId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Long getRosterRowId() {
		return rosterRowId;
	}
	public void setRosterRowId(Long rosterRowId) {
		this.rosterRowId = rosterRowId;
	}
	public Long getRosterColumnId() {
		return rosterColumnId;
	}
	public void setRosterColumnId(long rosterColumnId) {
		this.rosterColumnId = rosterColumnId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public RosterResult(Long rosterId, String atpId, String name, String discription, Long rosterRowId,
			Long rosterColumnId, String state, String type, String grade) {
		super();
		this.rosterId = rosterId;
		this.atpId = atpId;
		this.name = name;
		this.discription = discription;
		this.rosterRowId = rosterRowId;
		this.rosterColumnId = rosterColumnId;
		this.state = state;
		this.type = type;
		this.grade = grade;
	}
	public RosterResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
    
    

}
