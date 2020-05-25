package com.springJDBC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.springJDBC"})
public class App implements CommandLineRunner {
	
	Logger log=LoggerFactory.getLogger(App.class);
	
	@Autowired
	CustomerDao dao;
	public static void main(String[] args) {
		System.out.println("Main");
		SpringApplication.run(App.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Hiiiiiii");
		log.debug("HIIIIII   Subhash");
		Customer customer= new Customer(3,"Subhash","s@gml",145,"BLR");
	dao.addCstomer(customer);
		System.out.println("Done.....");
	}
}
