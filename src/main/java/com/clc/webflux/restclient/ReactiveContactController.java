/**
 * 
 */
package com.clc.webflux.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clc.webflux.domain.Contact;
import com.clc.webflux.repository.ReactiveContactRepository;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <p>
 * <b>Description:</b>
 * </p>
 * <p>
 *  This is a Reactive Controller that will response to request and return a response. 
 * </p>
 * @author Paul W. Nichols --Wabtec Inc.
 * @version 0.1
 *
 */
@RestController
@Slf4j
@RequestMapping(value="/api/contacts")
public class ReactiveContactController {
	
	@Autowired
	ReactiveContactRepository contactRepo;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/findall")
    public Flux<Contact> getAll() {
		Flux<Contact> result=null;
		try {
			result=contactRepo.findAll();
		}
		catch(Exception e) {
			result= Flux.error(e);
			log.error("An exception has occurred.");
			log.error("Strack Trace:",e);
		}
		// retrieve all
    	return result;
    }
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
    public Mono<Contact> getContactById(@PathVariable Long id) {
		Mono<Contact> result;
		try {
			result= contactRepo.findById(id);
		}
		catch(Exception e) {
			result= Mono.error(e);
			log.error("An exception has occurred.");
			log.error("Strack Trace:",e);
		}
		return result;
    }
	/**
	 * 
	 * @param firstname
	 * @param lastname
	 * @return
	 */
	@GetMapping("/findbynames")
	public Flux<Contact> findByFirstnameAndLastname(@RequestParam String firstname, @RequestParam String lastname){
		Flux<Contact> result=null;
		try {
			result=contactRepo.findByFirstNameAndLastname(firstname,lastname);
		}
		catch(Exception e) {
			result= Flux.error(e);
			log.error("An exception has occurred.");
			log.error("Strack Trace:",e);
		}
		// retrieve all
    	return result;
    }

	/**
	 * 
	 * @param email
	 * @return
	 */
	@GetMapping("/findbyemail/{email}")
	public Mono<Contact> findByEmail(@PathVariable String email ){
		Mono<Contact> result;
		try {
			result= contactRepo.findByEmail(email);
		}
		catch(Exception e) {
			result= Mono.error(e);
			log.error("An exception has occurred.");
			log.error("Strack Trace:",e);
		}
		return result;
    }
	
	
	/**
	 * 
	 * @param lastName
	 * @return
	 */
	@GetMapping("/findbylastname/{lastName}")
	public Flux<Contact> findByLastName(@PathVariable String lastName ){
		Flux<Contact> result=null;
		try {
			result=contactRepo.findByLastName(lastName);
		}
		catch(Exception e) {
			result= Flux.error(e);
			log.error("An exception has occurred.");
			log.error("Strack Trace:",e);
		}
		// retrieve all
    	return result;
    }
	
	/**
	 * 
	 * @param firstName
	 * @return
	 */
	@GetMapping("/findbyfirstname/{firstName}")
	public Flux<Contact> findByFirstName(@PathVariable String firstName ){
		Flux<Contact> result=null;
		try {
			result=contactRepo.findByFirstName(firstName);
		}
		catch(Exception e) {
			result= Flux.error(e);
			log.error("An exception has occurred.");
			log.error("Strack Trace:",e);
		}
		// retrieve all
    	return result;
    }
	
	
	/**
	 * 
	 * @param phone
	 * @return
	 */
	@GetMapping("/findbyphone/{phone}")
	public Mono<Contact> findByCellPhone(@PathVariable String phone ){
		Mono<Contact> result;
		try {
			result= contactRepo.findByCellPhone(phone);
		}
		catch(Exception e) {
			result= Mono.error(e);
			log.error("An exception has occurred.");
			log.error("Strack Trace:",e);
		}
		return result;
    }

}
