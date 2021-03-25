package org.tommot.productservice.model.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tommot.productservice.model.Product;
import org.tommot.productservice.model.repository.ProductRepository;
import org.tommot.productservice.model.service.ProductService;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    //@Autowired
    private final ProductRepository productRepository;
    private ProductService productService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAllProducts(){
        log.info("Implementing: findAllProducts");
        return productRepository.findAll();
    }

    @PostMapping("/create/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
        log.info("Implementing: createProduct");
        productRepository.save(product);
        //Product newProduct = productRepository.save(product);
        //return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
}
