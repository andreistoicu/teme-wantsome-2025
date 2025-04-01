package org.wantsome.domain_dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {

    static long idCount =1L;

    public List<Organizer> findAll(){
        return List.of(
                new Organizer(1L, "Bartolomeu", "bartolomeu@email.com"),
                new Organizer(2L, "Nina", "nina@email.com")
        );
    }
    public Long save(Organizer organizer){
        organizer.setId(idCount++);
        System.out.println("Organizer saved " + organizer);

        return organizer.getId();
    }
}
