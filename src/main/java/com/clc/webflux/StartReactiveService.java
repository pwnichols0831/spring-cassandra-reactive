/**
 * 
 */
package com.clc.webflux;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clc.webflux.domain.Contact;
import com.clc.webflux.repository.ReactiveContactRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <b>Description</b>
 * </p>
 * <p>
 * This is the startup class for the CassandraService. 
 * @author Dr. Paul W. Nichols
 *
 */
@SpringBootApplication
@Slf4j
public class StartReactiveService implements CommandLineRunner {

	@Autowired
	ReactiveContactRepository contactRepo;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("Starting Application.");
		SpringApplication.run(StartReactiveService.class, args);
		

	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Entering the run method.");
		log.debug("Calling the addNewRecords method." );
		addNewRecords();
	}
	/**
	 * This method adds 4 Sample Records to the database table, contacts.
	 */
	private void addNewRecords() {
		log.info("Adding 4 Sample records.");
			contactRepo.saveAll(Arrays.asList(
				new Contact(Long.valueOf(1), "Mr.","Walter", "M.","White", "","walter.white@yahoo.com","904-867-5309"),
				new Contact(Long.valueOf(2), "Mr.","Robert", "D.","Borrough","", "robert.borrough@yahoo.com","340-909-0099"),
				new Contact(Long.valueOf(3), "Mrs.","Betty", "M.","White", "","betty.white@yahoo.com","308-909-3099"),
				new Contact(Long.valueOf(4),"Mr.","Paul", "W.","Johnson", "", "paul.johnson@gmail.com","770-909-1099")
			 )
		    ).subscribe(System.out::println);
	}
}
