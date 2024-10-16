package com.microservices.inventory.service;

import com.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryServices {

    private final InventoryRepository inventoryrepository;

    public boolean InStock(String sku_code, Integer quantity)
    {
        return inventoryrepository.existsByskuCodeAndQuantityGreaterThanEqual(sku_code,quantity);
    }

}
