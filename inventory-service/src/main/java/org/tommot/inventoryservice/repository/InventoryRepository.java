package org.tommot.inventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tommot.inventoryservice.model.Inventory;

public interface InventoryRepository  extends MongoRepository<Inventory, Long> {
}
