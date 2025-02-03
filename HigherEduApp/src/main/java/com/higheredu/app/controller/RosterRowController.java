package com.higheredu.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.higheredu.app.model.RosterRow;
import com.higheredu.app.service.RosterRowService;

import java.util.List;

@RestController
@RequestMapping("/roster-rows")
public class RosterRowController {

    @Autowired
    private RosterRowService rosterRowService;

    @GetMapping
    public List<RosterRow> getAllRosterRows() {
        return rosterRowService.getAllRosterRows();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RosterRow> getRosterRowById(@PathVariable Long id) {
        return rosterRowService.getRosterRowById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RosterRow createRosterRow(@RequestBody RosterRow rosterRow) {
        return rosterRowService.saveRosterRow(rosterRow);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRosterRow(@PathVariable Long id) {
        return rosterRowService.getRosterRowById(id)
                .map(row -> {
                    rosterRowService.deleteRosterRow(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
