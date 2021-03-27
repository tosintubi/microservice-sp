package org.tommot.productservice.model.service;


import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tommot.productservice.model.Product;
import org.tommot.productservice.model.repository.ProductRepository;

import java.util.List;

@Service
@NoArgsConstructor
public class ProductService {


    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
