package org.tommot.inventoryservice.controller;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tommot.inventoryservice.service.InventoryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{skuCode}")
    Boolean isInStock(@PathVariable String skuCode){
        return inventoryService.checkStock(skuCode);
    }

    @GetMapping("/stock/{skuCode}")
    Integer stockBalance(@PathVariable String skuCode){
        return inventoryService.getStockBalance(skuCode);
    }
}

