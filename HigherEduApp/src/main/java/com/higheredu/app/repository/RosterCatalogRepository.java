package com.higheredu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.app.model.RosterCatalogInfo;

import java.util.List;

@Repository
public interface RosterCatalogRepository extends JpaRepository<RosterCatalogInfo, Long> {
    List<RosterCatalogInfo> findAllByRosterCatalogIdIn(List<Long> rosterCatalogIds);
    List<RosterCatalogInfo> findAllByTypeKey(String typeKey);
}
