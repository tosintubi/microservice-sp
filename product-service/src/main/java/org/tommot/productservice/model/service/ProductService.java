package org.tommot.productservice.model.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.tommot.productservice.model.Product;
import org.tommot.productservice.model.repository.ProductRepository;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;


    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
