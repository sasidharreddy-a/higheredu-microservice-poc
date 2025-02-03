package com.higheredu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.app.model.RosterRow;


@Repository
public interface RosterRowRepository extends JpaRepository<RosterRow, Long> {

}
