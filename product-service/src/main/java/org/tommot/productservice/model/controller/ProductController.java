package org.tommot.productservice.model.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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


    @PostMapping("/create/")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
