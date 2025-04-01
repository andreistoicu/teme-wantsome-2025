package org.wantsome.service;

import org.springframework.stereotype.Service;
import org.wantsome.domain_dao.Organizer;
import org.wantsome.domain_dao.OrganizerRepository;

import java.util.List;

@Service
public class OrganizerService {
    private final OrganizerRepository organizerRepository;

    public OrganizerService(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    public List<Organizer> listOrganizers(){
        return organizerRepository.findAll();
    }

    public Long saveOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public Object findAll() {
        return null;
    }

    public void save(Organizer organizer) {
    }
}
