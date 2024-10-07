package ma.amarghad.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.amarghad.billingservice.models.Product;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private double quantity;
    private double price;
    private String productId;
    @Transient
    private Product product;
    @ManyToOne
    private Bill bill;
}
