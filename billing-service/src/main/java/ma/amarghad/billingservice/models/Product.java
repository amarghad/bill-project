package ma.amarghad.billingservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Product {
    private String id;
    private String label;
    private double price;
    private double quantity;
}