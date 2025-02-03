package com.higheredu.app.service;

import java.util.List;

import com.higheredu.app.model.RosterCatalogInfo;


public interface RosterCatalogService {
    RosterCatalogInfo getRosterCatalog(Long rosterCatalogId);
    List<RosterCatalogInfo> getRosterCatalogsByIds(List<Long> rosterCatalogIds);
    List<Long> getRosterCatalogIdsByType(String rosterCatalogTypeKey);
    RosterCatalogInfo createRosterCatalog(RosterCatalogInfo rosterCatalogInfo);
    RosterCatalogInfo updateRosterCatalog(Long rosterCatalogId, RosterCatalogInfo rosterCatalogInfo);
}
