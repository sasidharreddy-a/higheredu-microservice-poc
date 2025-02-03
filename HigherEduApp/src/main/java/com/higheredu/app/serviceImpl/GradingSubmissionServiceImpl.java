package com.higheredu.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu.app.model.RosterColumn;
import com.higheredu.app.model.RosterSubmitInfo;
import com.higheredu.app.repository.RosterRepository;
import com.higheredu.app.service.GradingSubmissionService;



@Service
public class GradingSubmissionServiceImpl implements GradingSubmissionService {
    @Autowired
    private RosterRepository rosterRepository;
    @Override
    public boolean verifyRosterColumn(Long rosterColumnId) {
        Optional<RosterColumn> rosterColumn = rosterRepository.findById(rosterColumnId);
        return rosterColumn.isPresent() && rosterColumn.get().isSubmitted();
    }
    @Override
    public RosterColumn submitRosterColumn(RosterSubmitInfo rosterSubmitInfo) {
        Optional<RosterColumn> optionalRosterColumn = rosterRepository.findById(rosterSubmitInfo.getRosterColumnId());
        if (optionalRosterColumn.isPresent()) {
            RosterColumn rosterColumn = optionalRosterColumn.get();
            rosterColumn.setSubmitted(rosterSubmitInfo.getIsSubmitted());
            rosterColumn.setGraderId(rosterSubmitInfo.getGraderId());
            return rosterRepository.save(rosterColumn);
        }
        return null;
    }
    @Override
    public List<RosterColumn> getUnsubmittedRosterColumnsByGrader(String graderId) {
        return rosterRepository.findAllByGraderIdAndSubmittedFalse(graderId);
    }
}
 
