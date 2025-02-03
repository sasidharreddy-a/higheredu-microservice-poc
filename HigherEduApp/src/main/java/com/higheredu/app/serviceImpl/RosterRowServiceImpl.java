package com.higheredu.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu.app.model.RosterRow;
import com.higheredu.app.repository.RosterRowRepository;
import com.higheredu.app.service.RosterRowService;




@Service
public class RosterRowServiceImpl implements RosterRowService{
    @Autowired
    private RosterRowRepository rosterRowRepository;

    public List<RosterRow> getAllRosterRows() {
        return rosterRowRepository.findAll();
    }

    public Optional<RosterRow> getRosterRowById(Long id) {
        return rosterRowRepository.findById(id);
    }

    public RosterRow saveRosterRow(RosterRow rosterRow) {
        return rosterRowRepository.save(rosterRow);
    }

    public void deleteRosterRow(Long id) {
        rosterRowRepository.deleteById(id);
    }

}
