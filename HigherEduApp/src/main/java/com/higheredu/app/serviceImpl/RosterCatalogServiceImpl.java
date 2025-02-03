package com.higheredu.app.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu.app.model.RosterCatalogInfo;
import com.higheredu.app.repository.RosterCatalogRepository;
import com.higheredu.app.service.RosterCatalogService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RosterCatalogServiceImpl implements RosterCatalogService {

    @Autowired
    private RosterCatalogRepository rosterCatalogRepository;

    @Override
    public RosterCatalogInfo getRosterCatalog(Long rosterCatalogId) {
        Optional<RosterCatalogInfo> rosterCatalogInfo = rosterCatalogRepository.findById(rosterCatalogId);
        return rosterCatalogInfo.orElse(null);
    }

    @Override
    public List<RosterCatalogInfo> getRosterCatalogsByIds(List<Long> rosterCatalogIds) {
        return rosterCatalogRepository.findAllByRosterCatalogIdIn(rosterCatalogIds);
    }

    @Override
    public List<Long> getRosterCatalogIdsByType(String rosterCatalogTypeKey) {
        List<RosterCatalogInfo> rosterCatalogs = rosterCatalogRepository.findAllByTypeKey(rosterCatalogTypeKey);
        return rosterCatalogs.stream().map(RosterCatalogInfo::getRosterCatalogId).collect(Collectors.toList());
    }

    @Override
    public RosterCatalogInfo createRosterCatalog(RosterCatalogInfo rosterCatalogInfo) {
        return rosterCatalogRepository.save(rosterCatalogInfo);
    }

    @Override
    public RosterCatalogInfo updateRosterCatalog(Long rosterCatalogId, RosterCatalogInfo rosterCatalogInfo) {
        if (!rosterCatalogRepository.existsById(rosterCatalogId)) {
            return null;
        }
        rosterCatalogInfo.setRosterCatalogId(rosterCatalogId);
        return rosterCatalogRepository.save(rosterCatalogInfo);
    }
}
