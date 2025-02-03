package com.higheredu.app.service;

import java.util.List;
import java.util.Optional;

import com.higheredu.app.model.RosterColumn;


public interface RosterColumnService {
	public List<RosterColumn> getAllRosterColumns();
	public Optional<RosterColumn> getRosterColumnById(Long id);
	public RosterColumn saveRosterColumn(RosterColumn rosterColumn);
	public void deleteRosterColumn(Long id);
}
