package com.higheredu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.app.model.RosterResult;


@Repository
public interface RosterResultRepository extends JpaRepository<RosterResult,Long> {

}
