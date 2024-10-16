package com.microservices.inventory.repository;

import com.microservices.inventory.model.inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<inventory, Long> {
    boolean existsByskuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
}

