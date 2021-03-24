package org.tommot.productservice.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tommot.productservice.model.Product;

@Repository
public interface ProductRepository  extends MongoRepository<Product, String> {

}
