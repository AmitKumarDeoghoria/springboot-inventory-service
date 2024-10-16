package com.microservices.inventory.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.microservices.inventory.service.InventoryServices;
@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor


public class InventoryController {

  private final InventoryServices inventoryService;




    @GetMapping
      @ResponseStatus(HttpStatus.OK)
     public boolean InStock(@RequestParam String sku_code , @RequestParam Integer quantity)
       {
           System.out.println(sku_code+"ss"+quantity);
           return inventoryService.InStock(sku_code,quantity);
       }

}
