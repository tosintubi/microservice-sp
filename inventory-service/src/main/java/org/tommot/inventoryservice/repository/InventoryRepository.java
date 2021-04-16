package org.tommot.inventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tommot.inventoryservice.model.Inventory;

import java.util.Optional;

public interface InventoryRepository  extends MongoRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
