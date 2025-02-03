package com.higheredu.app.service;

import java.util.List;

import com.higheredu.app.model.RosterColumn;
import com.higheredu.app.model.RosterSubmitInfo;




public interface GradingSubmissionService {
    boolean verifyRosterColumn(Long rosterColumnId);
    RosterColumn submitRosterColumn(RosterSubmitInfo rosterSubmitInfo);
    List<RosterColumn> getUnsubmittedRosterColumnsByGrader(String graderId);
}
