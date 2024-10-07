package ma.amarghad.billingservice.service;

import ma.amarghad.billingservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("customer-service")
public interface CustomerRestClient {
    @GetMapping("customers/{id}")
    Customer getCustomer(@PathVariable Long id);
}
