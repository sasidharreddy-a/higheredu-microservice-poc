package com.higheredu.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.higheredu.app.model.RosterResult;
import com.higheredu.app.repository.RosterColumnRepository;
import com.higheredu.app.repository.RosterRowRepository;
import com.higheredu.app.service.RosterResultService;

import java.util.List;

@RestController
@RequestMapping("/roster-results")
public class RosterResultController {

    @Autowired
    private RosterResultService rosterResultService;

    @Autowired
    private RosterRowRepository rosterRowRepository;

    @Autowired
    private RosterColumnRepository rosterColumnRepository;

    @GetMapping
    public List<RosterResult> getAllRosterResults() {
        return rosterResultService.getAllRosterResults();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RosterResult> getRosterResultById(@PathVariable Long id) {
        return rosterResultService.getRosterResultById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RosterResult> createRosterResult(@RequestBody RosterResult rosterResult) {
        // Ensure the student and column exist
        boolean isStudentValid = rosterRowRepository.existsById(rosterResult.getRosterRowId());
        boolean isColumnValid = rosterColumnRepository.existsById(rosterResult.getRosterColumnId());

        if (isStudentValid && isColumnValid) {
            return ResponseEntity.ok(rosterResultService.saveRosterResult(rosterResult));
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRosterResult(@PathVariable Long id) {
        return rosterResultService.getRosterResultById(id)
                .map(rosterResult -> {
                    rosterResultService.deleteRosterResult(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

