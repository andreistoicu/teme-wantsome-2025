package org.wantsome.domain_dao;

import java.util.ArrayList;
import java.util.List;

public class EventRepository {
    private List<Event> events;
    private long idCount;

    public EventRepository(){events = new ArrayList<>();    }

    public List<Event> findEvents(){
        return List.of(
                new Event(1L, "Ziua Unirii", "Iasi", 1/12/2025),
                new Event(2L, "Pastele Catolic", "Roma", 1/5/2025)
        );
    }

    public List<Event> findAll(){return events;}

    public Long save(Event event){
        event.setId(idCount++);
        System.out.println("Event saved " + event);

        events.add(event);
        return null;
    }
}
