package com.higheredu.app.service;

import java.util.List;
import java.util.Optional;

import com.higheredu.app.model.RosterRow;


public interface RosterRowService {
	public List<RosterRow> getAllRosterRows();
	public Optional<RosterRow> getRosterRowById(Long id);
	public RosterRow saveRosterRow(RosterRow rosterRow);
	public void deleteRosterRow(Long id);
}
