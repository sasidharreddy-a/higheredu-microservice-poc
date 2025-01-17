package com.higheredu_api.grading_service.service;

import java.util.List;
import java.util.Optional;

import com.higheredu_api.grading_service.model.RosterResult;

public interface RosterResultService {
	public List<RosterResult> getAllRosterResults();
	public Optional<RosterResult> getRosterResultById(Long id);
	public RosterResult saveRosterResult(RosterResult rosterResult);
	public void deleteRosterResult(Long id);
	
}
