package org.tommot.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.tommot.inventoryservice.model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository  extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);


    @Query("SELECT SUM(i.stock) from Inventory i WHERE i.skuCode = 'skuCode'")
    Integer getStockBalance(String skuCode);
}
