package com.carroti.boot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carroti.boot.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    void delete(Product deleted);
}
