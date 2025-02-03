package com.higheredu.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.higheredu.app.model.RosterColumn;

import java.util.List;

@RestController
@RequestMapping("/roster-columns")
public class RosterColumnController {

    @Autowired
    private com.higheredu.app.service.RosterColumnService rosterColumnService;

    @GetMapping
    public List<RosterColumn> getAllRosterColumns() {
        return rosterColumnService.getAllRosterColumns();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RosterColumn> getRosterColumnById(@PathVariable Long id) {
        return rosterColumnService.getRosterColumnById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RosterColumn createRosterColumn(@RequestBody RosterColumn rosterColumn) {
        return rosterColumnService.saveRosterColumn(rosterColumn);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRosterColumn(@PathVariable Long id) {
        return rosterColumnService.getRosterColumnById(id)
                .map(column -> {
                    rosterColumnService.deleteRosterColumn(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

