package com.higheredu_api.grading_service.service;

import java.util.List;

import com.higheredu_api.grading_service.model.RosterCatalogInfo;

public interface RosterCatalogService {
    RosterCatalogInfo getRosterCatalog(Long rosterCatalogId);
    List<RosterCatalogInfo> getRosterCatalogsByIds(List<Long> rosterCatalogIds);
    List<Long> getRosterCatalogIdsByType(String rosterCatalogTypeKey);
    RosterCatalogInfo createRosterCatalog(RosterCatalogInfo rosterCatalogInfo);
    RosterCatalogInfo updateRosterCatalog(Long rosterCatalogId, RosterCatalogInfo rosterCatalogInfo);
}
