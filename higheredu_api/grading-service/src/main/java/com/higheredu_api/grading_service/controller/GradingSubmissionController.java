package com.higheredu_api.grading_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higheredu_api.grading_service.model.RosterColumn;
import com.higheredu_api.grading_service.model.RosterSubmitInfo;
import com.higheredu_api.grading_service.service.GradingSubmissionService;


@RestController
@RequestMapping
("/api/grading")
public class GradingSubmissionController {
    @Autowired
    private GradingSubmissionService gradingSubmissionService;
    
    @GetMapping("/verifyRosterColumn/{rosterColumnId}")
    public ResponseEntity<Boolean> verifyRosterColumn(@PathVariable
    		Long rosterColumnId) {
        boolean isVerified = gradingSubmissionService.verifyRosterColumn(rosterColumnId);
        return ResponseEntity.ok(isVerified);
    }
    @PostMapping("/submitRosterColumn")
    public ResponseEntity<RosterColumn> submitRosterColumn(@RequestBody RosterSubmitInfo rosterSubmitInfo) {
        RosterColumn rosterColumn = gradingSubmissionService.submitRosterColumn(rosterSubmitInfo);
        if (rosterColumn != null) {
            return ResponseEntity.ok(rosterColumn);
        }
        return ResponseEntity.badRequest().build();
    }
    @GetMapping("/unsubmittedRosterColumns/{graderId}")
    public ResponseEntity<List<RosterColumn>> getUnsubmittedRosterColumnsByGrader(@PathVariable String graderId) {
        List<RosterColumn> unsubmittedRosterColumns = gradingSubmissionService.getUnsubmittedRosterColumnsByGrader(graderId);
        return ResponseEntity.ok(unsubmittedRosterColumns);
    }
}
 
