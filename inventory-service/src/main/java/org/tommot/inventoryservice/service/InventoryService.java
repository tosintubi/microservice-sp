package org.tommot.inventoryservice.service;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tommot.inventoryservice.model.Inventory;
import org.tommot.inventoryservice.repository.InventoryRepository;


import java.util.List;

@Service
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

public class InventoryService
{
    @Autowired
    private  InventoryRepository inventoryRepository;
    private final static String PRODUCT_NOT_FOUND_SKU_CODE = "Cannot find product by Sku Code :";

    public Boolean checkStock(String skuCode) {
        Inventory inventory = inventoryRepository.findBySkuCode(skuCode)
                .orElseThrow(() -> new RuntimeException(PRODUCT_NOT_FOUND_SKU_CODE + skuCode));
        return inventory.getStock() > 0;
    }


    // Checks if item in stock, returns the balance else return -1
    public Integer getStockBalance(String skuCode) {
        return (checkStock(skuCode)) ? inventoryRepository.getStockBalance(skuCode) : -1;
    }
}
