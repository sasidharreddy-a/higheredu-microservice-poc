package com.higheredu.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.app.model.RosterColumn;


@Repository
public interface RosterRepository extends JpaRepository<RosterColumn, Long> {
    List<RosterColumn> findAllByGraderIdAndSubmittedFalse(String graderId);
}
