package com.fdev.account;

import com.fdev.account.model.Customer;
import com.fdev.account.repository.CustomerRepository;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Clock;
import java.util.HashSet;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {


	private final CustomerRepository customerRepository;

	public AccountApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Bean
	public Clock clock() {
		return Clock.systemUTC();
	}


	@Override
	public void run(String... args)  {
		Customer customer = customerRepository.save(new Customer("","Cagri", "Dursun",new HashSet<>()));

		System.out.println(customer);

	}
}
