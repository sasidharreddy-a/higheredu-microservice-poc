package com.higheredu_api.grading_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu_api.grading_service.model.RosterResult;

@Repository
public interface RosterResultRepository extends JpaRepository<RosterResult,Long> {

}
