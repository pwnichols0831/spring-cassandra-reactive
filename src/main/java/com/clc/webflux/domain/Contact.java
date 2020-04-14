/**
 * 
 */
package com.clc.webflux.domain;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author pnichols
 *
 */
@Table ("contacts")
@Getter @Setter
public class Contact {
  @PrimaryKey
  private Long id;
  private String title;
  private String firstName;
  private String middle;
  private String lastName;
  private String suffix;
  private String email;
  private String cellPhone;
  
  public Contact(Long id, String title, String firstName, String middle, String lastName, String suffix,
		  String email, String cellPhone) {
	  this.cellPhone=cellPhone;
	  this.email=email;
	  this.firstName=firstName;
	  this.id=id;
	  this.lastName=lastName;
	  this.middle=middle;
	  this.suffix=suffix;
	  this.title=title;
  }
  public Contact() {
	  super();
  }
  
  
  
}
