package ma.amarghad.customerservice;

import ma.amarghad.customerservice.entities.Customer;
import ma.amarghad.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			List<Customer> customers = Stream.of("Mohamed", "Aziz", "Salma", "Amina", "Omar")
					.map(name -> Customer.builder()
							.email(name + "@gmail.com")
							.firstName(name)
							.lastName(name)
							.build()
					)
					.toList();

			customerRepository.saveAll(customers);
		};
	}
}
