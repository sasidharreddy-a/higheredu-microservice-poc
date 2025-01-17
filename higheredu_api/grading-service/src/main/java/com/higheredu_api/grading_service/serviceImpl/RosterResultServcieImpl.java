package com.higheredu_api.grading_service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu_api.grading_service.model.RosterResult;
import com.higheredu_api.grading_service.repository.RosterResultRepository;
import com.higheredu_api.grading_service.service.RosterResultService;
@Service
public class RosterResultServcieImpl implements RosterResultService{
	  @Autowired
	    private RosterResultRepository rosterResultRepository;

	    public List<RosterResult> getAllRosterResults() {
	        return rosterResultRepository.findAll();
	    }

	    public Optional<RosterResult> getRosterResultById(Long id) {
	        return rosterResultRepository.findById(id);
	    }

	    public RosterResult saveRosterResult(RosterResult rosterResult) {
	        return rosterResultRepository.save(rosterResult);
	    }

	    public void deleteRosterResult(Long id) {
	        rosterResultRepository.deleteById(id);
	    }

	
}
