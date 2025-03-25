package org.wantsome.domain_dao;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> findProducts(){
        return List.of(
                new Product(5L, "aspirator", 123, true),
                new Product(4L, "bicicleta", 456, false),
                new Product(98L, "blugi", 789, true)
        );
    }
}
