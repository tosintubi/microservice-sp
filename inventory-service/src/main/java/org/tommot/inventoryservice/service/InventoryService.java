package org.tommot.inventoryservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tommot.inventoryservice.model.Inventory;
import org.tommot.inventoryservice.repository.InventoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public Boolean checkStock(String skuCode) {
        Inventory inventory = inventoryRepository.findBySkuCode(skuCode)
                .orElseThrow(() -> new RuntimeException("Cannot find product by Sku Code: "+skuCode));
        return inventory.getStock() > 0;
    }

    public Integer getStockBalance(String skuCode) {
        List<Inventory> inventory = inventoryRepository.getStockBalance(skuCode);
        return inventory.size();
    }
}
