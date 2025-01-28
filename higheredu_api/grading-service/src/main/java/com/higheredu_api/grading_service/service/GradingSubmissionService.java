package com.higheredu_api.grading_service.service;

import java.util.List;

import com.higheredu_api.grading_service.model.RosterColumn;
import com.higheredu_api.grading_service.model.RosterSubmitInfo;



public interface GradingSubmissionService {
    boolean verifyRosterColumn(Long rosterColumnId);
    RosterColumn submitRosterColumn(RosterSubmitInfo rosterSubmitInfo);
    List<RosterColumn> getUnsubmittedRosterColumnsByGrader(String graderId);
}
