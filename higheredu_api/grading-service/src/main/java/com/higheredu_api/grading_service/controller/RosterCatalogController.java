package com.higheredu_api.grading_service.controller;

import com.higheredu_api.grading_service.model.RosterCatalogInfo;
import com.higheredu_api.grading_service.service.RosterCatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rosterCatalog")
public class RosterCatalogController {

    @Autowired
    private RosterCatalogService rosterCatalogService;

    @GetMapping("/{rosterCatalogId}")
    public ResponseEntity<RosterCatalogInfo> getRosterCatalog(
            @PathVariable Long rosterCatalogId) {
        RosterCatalogInfo rosterCatalogInfo = rosterCatalogService.getRosterCatalog(rosterCatalogId);
        if (rosterCatalogInfo != null) {
            return ResponseEntity.ok(rosterCatalogInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/listByIds")
    public ResponseEntity<List<RosterCatalogInfo>> getRosterCatalogsByIds(
            @RequestBody List<Long> rosterCatalogIds) {
        List<RosterCatalogInfo> rosterCatalogInfos = rosterCatalogService.getRosterCatalogsByIds(rosterCatalogIds);
        return ResponseEntity.ok(rosterCatalogInfos);
    }

    @GetMapping("/idsByType/{rosterCatalogTypeKey}")
    public ResponseEntity<List<Long>> getRosterCatalogIdsByType(
            @PathVariable String rosterCatalogTypeKey) {
        List<Long> rosterCatalogIds = rosterCatalogService.getRosterCatalogIdsByType(rosterCatalogTypeKey);
        return ResponseEntity.ok(rosterCatalogIds);
    }

    @PostMapping("/create")
    public ResponseEntity<RosterCatalogInfo> createRosterCatalog(
            @RequestBody RosterCatalogInfo rosterCatalogInfo) {
        RosterCatalogInfo createdRosterCatalog = rosterCatalogService.createRosterCatalog(rosterCatalogInfo);
        return ResponseEntity.ok(createdRosterCatalog);
    }

    @PutMapping("/update/{rosterCatalogId}")
    public ResponseEntity<RosterCatalogInfo> updateRosterCatalog(
            @PathVariable Long rosterCatalogId,
            @RequestBody RosterCatalogInfo rosterCatalogInfo) {
        RosterCatalogInfo updatedRosterCatalog = rosterCatalogService.updateRosterCatalog(rosterCatalogId, rosterCatalogInfo);
        if (updatedRosterCatalog != null) {
            return ResponseEntity.ok(updatedRosterCatalog);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
