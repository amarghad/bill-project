package ma.amarghad.inventoryservice;

import ma.amarghad.inventoryservice.entities.Product;
import ma.amarghad.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository) {
		return args -> {
			Product $1 = Product.builder().label("Smartphone").price(699.99).quantity(50).build();
			Product $2 = Product.builder().label("Laptop").price(1299.99).quantity(30).build();
			Product $3 = Product.builder().label("Wireless Headphones").price(199.99).quantity(100).build();
			Product $4 = Product.builder().label("Smartwatch").price(299.99).quantity(75).build();
			Product $5 = Product.builder().label("Gaming Console").price(499.99).quantity(20).build();

			productRepository.saveAll(
					List.of($1, $2, $3, $4, $5)
			);
		};
	}

}
