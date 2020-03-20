package com.liu;

import com.liu.accessingdatajpa.Customer;
import com.liu.accessingdatajpa.CustomerRepository;
import com.liu.initialization.SimpleTestInitializationBean;
import com.liu.source.chap5.EntityBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class Sb2Application {
    public static final Log logger = LogFactory.getLog(Sb2Application.class);

    public static void main(String[] args) {
//        SpringApplication.run(Sb2Application.class, args);
        //还可以像下面这样写
        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//        springApplication.addInitializers(initializers);
//        springApplication.addListeners(listeners);
//        springApplication.addPrimarySources(additionalPrimarySources);
//        logger.debug("listeners=" + springApplication.getListeners());
        springApplication.run(args);
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
            logger.debug("Customers found with findAll():");
            logger.debug("-------------------------------");
            for (Customer customer : repository.findAll()) {
                logger.debug(customer.toString());
            }
            logger.debug("");

            //fetch customers by last name
            logger.debug("Customers found with findByLastName('Bauer'):");
            logger.debug("-------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                logger.debug(bauer.toString());
            });
            logger.debug("");

        };
    }

    //这里的定义会替代@component修饰的SimpleTestInitializationBean
    @Bean
    public EntityBean simpleTestInitializationBean() {
        return new EntityBean();
    }

}
