/**
 * 
 */
package com.clc.webflux.restclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.clc.webflux.domain.Contact;

import jnr.ffi.Struct.sa_family_t;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * @author pnichols
 *
 */
@Service
@Slf4j
public class ClientRestService {
	
	@Value("${contacts.delete.url}")
	private String url;
	
   private WebClient webClient=WebClient.create();
   
	public Mono<Contact> getRecord(long id) {
	    return webClient.get()
	                    .uri(url, id)
	                    .retrieve()
	                    .bodyToMono(Contact.class);
	                    
	
	}
}
