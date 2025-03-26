package org.wantsome.domain_dao;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products;
    static long idCount =1L;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    public List<Product> findProducts(){
        return List.of(
                new Product(5L, "aspirator", 123, true),
                new Product(4L, "bicicleta", 456, false),
                new Product(98L, "blugi", 789, true)
        );
    }

    public List<Product> findAll(){
        return products;
    }

    public void save(Product product) {
        product.setId(idCount++);
        System.out.println("Product saved " + product);

        products.add(product);
    }
}
