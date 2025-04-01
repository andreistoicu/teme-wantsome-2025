package org.wantsome.domain_dao;

import java.sql.Date;
import java.util.Objects;

public class Event {
    private Long id;
    private String eventName;
    private String location;
    private Date date;

    public Event(Long id, String eventName, String location, Date date, Organizer organizer) {
        this.id = id;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
    }

    public Event(long id, String ziuaUnirii, String iasi, int i) {
    }

    public Event() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) && Objects.equals(eventName, event.eventName) && Objects.equals(location, event.location) && Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventName, location, date);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }
}
