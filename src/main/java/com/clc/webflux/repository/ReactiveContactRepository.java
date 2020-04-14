/**
 * 
 */
package com.clc.webflux.repository;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clc.webflux.domain.Contact;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author pnichols
 *
 */
@Repository
@Transactional
public interface ReactiveContactRepository extends ReactiveCrudRepository<Contact, Long> {
	
	
	@Query("SELECT * FROM contacts WHERE firstName = ?0 and lastName  = ?1 ALLOW FILTERING")
	Flux<Contact> findByFirstNameAndLastname(String firstname, String lastname);
	
	@Query("SELECT * FROM contacts WHERE email = ?0")
	Mono<Contact> findByEmail(String email);
	
	@Query("SELECT * FROM contacts WHERE lastName = ?0")
	Flux<Contact> findByLastName(String lastName);
	
	
	@Query("SELECT * FROM contacts WHERE cellphone = ?0")
	Mono<Contact> findByCellPhone(String cellPhone);
	
	@Query("SELECT * FROM contacts WHERE firstname = ?0")
	Flux<Contact> findByFirstName(String firstName);
	
	
	
}