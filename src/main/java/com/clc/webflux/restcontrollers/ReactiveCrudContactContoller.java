/**
 * 
 */
package com.clc.webflux.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.WriteResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clc.webflux.domain.Contact;
import com.clc.webflux.repository.ReactiveContactRepository;
import com.clc.webflux.restclient.ClientRestService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * @author pnichols
 *
 */

@RestController
@Slf4j
@RequestMapping(value="/api/contacts")
public class ReactiveCrudContactContoller {
	
	@Autowired
	ReactiveContactRepository contactRepository;
	
	@Autowired
	ClientRestService client;
	
	@PutMapping("/insertRecord")
	public Mono<String> insertNewRecord(@RequestBody Contact contact){
		Mono<String> result;
		try {
			contactRepository.save(contact);
			result=Mono.just("Record was saved to database");
		}
		catch(Exception e) {
			log.error("An Exception has occurred while attempting to create new record.");
			log.error("Stack Trace",e);
			result= Mono.just("A Database error has occurred. Record was not saved.");
		}
		return result;
	}
	
	@PutMapping("/updateRecord")
	public Mono<String> updateRecord(@RequestBody Contact contact){
		Mono<String> result;
		try {
			
			contactRepository.save(contact).subscribe();
			result=Mono.just("Record was saved to database");
		}
		catch(Exception e) {
			log.error("An Exception has occurred while attempting to create new record.");
			log.error("Stack Trace",e);
			result= Mono.just("A Database error has occurred. Record was not saved.");
		}
		return result;
	}
	@PutMapping("/deleteRecord/{id}")
	public Mono<String> deleteRecord(@PathVariable Long id){
		Mono<String>result;
		try {
		
		    contactRepository.deleteById(id).subscribe();
			result=Mono.just("Contact Record deleted successfully");
		}
		catch(Exception e) {
			log.error("An Exception has occurred while attempting to create new record.");
			log.error("Stack Trace",e);
			result = Mono.just("A Database error has occurred. Record was not saved.");
		}
		return result;
	}
	
	
	
	
	
	
	
}
