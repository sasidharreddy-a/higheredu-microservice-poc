package com.higheredu_api.grading_service.repository;

import com.higheredu_api.grading_service.model.RosterCatalogInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RosterCatalogRepository extends JpaRepository<RosterCatalogInfo, Long> {
    List<RosterCatalogInfo> findAllByRosterCatalogIdIn(List<Long> rosterCatalogIds);
    List<RosterCatalogInfo> findAllByTypeKey(String typeKey);
}
