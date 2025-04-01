package org.wantsome.domain_dao;


import java.util.Objects;

public class Organizer {
    private Long id;
    private String name;
    private String contactEmail;

    public Organizer(Long id, String name, String contactEmail) {
        this.id = id;
        this.name = name;
        this.contactEmail = contactEmail;
    }

    public Organizer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Organizer organizer = (Organizer) o;
        return Objects.equals(id, organizer.id) && Objects.equals(name, organizer.name) && Objects.equals(contactEmail, organizer.contactEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, contactEmail);
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}
