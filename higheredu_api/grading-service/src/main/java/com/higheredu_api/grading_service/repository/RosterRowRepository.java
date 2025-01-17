package com.higheredu_api.grading_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu_api.grading_service.model.RosterRow;

@Repository
public interface RosterRowRepository extends JpaRepository<RosterRow, Long> {

}
