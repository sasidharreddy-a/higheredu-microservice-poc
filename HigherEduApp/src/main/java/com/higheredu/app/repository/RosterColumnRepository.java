package com.higheredu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.app.model.RosterColumn;


@Repository
public interface RosterColumnRepository extends JpaRepository<RosterColumn, Long>{

}
