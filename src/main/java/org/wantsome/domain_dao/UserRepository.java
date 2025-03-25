package org.wantsome.domain_dao;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<User> findAll() {
        return List.of(
                new User(1L, "Ion Dolanescu", "ion@dol.com"),
                new User(2L, "Petrica Dolanescu", "petru@dol.com"),
                new User(3L, "Floarea Dolanescu", "floarea@dol.com")
        );
    }
}
