package com.higheredu.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roster-row")
public class RosterRow {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rosterRowState;
	private String rosterRowType;
	private String name;
	private String discription;
	private int rosterId;
	private String atpId;
	private String studentId;
	private String refUri;
	private String refId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRosterRowState() {
		return rosterRowState;
	}
	public void setRosterRowState(String rosterRowState) {
		this.rosterRowState = rosterRowState;
	}
	public String getRosterRowType() {
		return rosterRowType;
	}
	public void setRosterRowType(String rosterRowType) {
		this.rosterRowType = rosterRowType;
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
	public int getRosterId() {
		return rosterId;
	}
	public void setRosterId(int rosterId) {
		this.rosterId = rosterId;
	}
	public String getAtpId() {
		return atpId;
	}
	public void setAtpId(String atpId) {
		this.atpId = atpId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getRefUri() {
		return refUri;
	}
	public void setRefUri(String refUri) {
		this.refUri = refUri;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public RosterRow(Long id, String rosterRowState, String rosterRowType, String name, String discription, int rosterId,
			String atpId, String studentId, String refUri, String refId) {
		super();
		this.id = id;
		this.rosterRowState = rosterRowState;
		this.rosterRowType = rosterRowType;
		this.name = name;
		this.discription = discription;
		this.rosterId = rosterId;
		this.atpId = atpId;
		this.studentId = studentId;
		this.refUri = refUri;
		this.refId = refId;
	}
	public RosterRow() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
