package ma.amarghad.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.amarghad.billingservice.models.Customer;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data @Builder
@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String date;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
    private String customerId;
    @Transient
    private Customer customer;

}
