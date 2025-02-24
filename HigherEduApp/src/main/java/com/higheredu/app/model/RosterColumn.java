package com.higheredu.app.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roster-column")
public class RosterColumn {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rosterColumnState;
	private String rosterColumnType;
	private String name;
	private String discription;
	private int rosterId;
	private String atpId;
	private String instructorName;
	private String refUri;
	private String refId;
	private boolean submitted;
    private String graderId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRosterColumnState() {
		return rosterColumnState;
	}
	public void setRosterColumnState(String rosterColumnState) {
		this.rosterColumnState = rosterColumnState;
	}
	public String getRosterColumnType() {
		return rosterColumnType;
	}
	public void setRosterColumnType(String rosterColumnType) {
		this.rosterColumnType = rosterColumnType;
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
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
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
	public boolean isSubmitted() {
		return submitted;
	}
	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}
	public String getGraderId() {
		return graderId;
	}
	public void setGraderId(String graderId) {
		this.graderId = graderId;
	}
	public RosterColumn(Long id, String rosterColumnState, String rosterColumnType, String name, String discription,
			int rosterId, String atpId, String instructorName, String refUri, String refId, boolean submitted,
			String graderId) {
		super();
		this.id = id;
		this.rosterColumnState = rosterColumnState;
		this.rosterColumnType = rosterColumnType;
		this.name = name;
		this.discription = discription;
		this.rosterId = rosterId;
		this.atpId = atpId;
		this.instructorName = instructorName;
		this.refUri = refUri;
		this.refId = refId;
		this.submitted = submitted;
		this.graderId = graderId;
	}
	public RosterColumn() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}