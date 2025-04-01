package org.wantsome.domain_dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;

        public Student() {        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }


        public Student(Long id, String firstName, String lastName, String email) {
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;


        }

        @Override
        public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return Objects.equals(id, student.id) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(email, student.email);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, firstName, lastName, email);
        }

        @Override
        public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", email='" + email + '\'' +
                        '}';
        }
}
