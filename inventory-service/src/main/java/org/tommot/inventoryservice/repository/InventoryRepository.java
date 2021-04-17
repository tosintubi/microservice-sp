package org.tommot.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tommot.inventoryservice.model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository  extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
    //List<Inventory> getStockBalance(String skuCode);
}
