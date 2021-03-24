package org.tommot.productservice.model.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.tommot.productservice.model.Product;
import org.tommot.productservice.model.repository.ProductRepository;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {


    private ProductRepository productRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
}
