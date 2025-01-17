package com.higheredu_api.grading_service.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu_api.grading_service.model.RosterColumn;
import com.higheredu_api.grading_service.repository.RosterColumnRepository;
import com.higheredu_api.grading_service.service.RosterColumnService;

@Service
public class RosterColumnServiceImpl implements RosterColumnService {
	@Autowired
	private RosterColumnRepository rosterColumnRepository;

	public List<RosterColumn> getAllRosterColumns() {
	    return rosterColumnRepository.findAll();
	}

	public Optional<RosterColumn> getRosterColumnById(Long id) {
	    return rosterColumnRepository.findById(id);
	}

	public RosterColumn saveRosterColumn(RosterColumn rosterColumn) {
	    return rosterColumnRepository.save(rosterColumn);
	}

	public void deleteRosterColumn(Long id) {
	    rosterColumnRepository.deleteById(id);

	}
}
