package org.tommot.inventoryservice.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tommot.inventoryservice.service.InventoryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inventory")
@Slf4j
public class InventoryController {

    @Autowired
    private final InventoryService inventoryService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{skuCode}")
    Boolean isInStock(@PathVariable String skuCode){
        log.info("Implementing: isInStock");
        return inventoryService.checkStock(skuCode);
    }

//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping("/stock/{skuCode}")
//    Integer stockBalance(@PathVariable String skuCode){
//        log.info("Implementing: stockBalance");
//        return inventoryService.getStockBalance(skuCode);
//    }
}

