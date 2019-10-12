package com.liu;

import com.liu.accessingdatajpa.Customer;
import com.liu.accessingdatajpa.CustomerRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class Sb2Application {
    Log logger = LogFactory.getLog(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(Sb2Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            //fetch all customers
            logger.info("Customers found with findAll():");
            logger.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                logger.info(customer.toString());
            }
            logger.info("");

            //fetch customers by last name
            logger.info("Customers found with findByLastName('Bauer'):");
            logger.info("-------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                logger.info(bauer.toString());
            });
            logger.info("");

        };
    }

}
