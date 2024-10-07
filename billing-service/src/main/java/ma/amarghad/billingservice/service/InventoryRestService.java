package ma.amarghad.billingservice.service;

import ma.amarghad.billingservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("inventory-service")
public interface InventoryRestService {
    Product getProduct(String productId);
}
