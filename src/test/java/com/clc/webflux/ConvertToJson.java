package com.clc.webflux;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.clc.webflux.domain.Contact;
import com.fasterxml.jackson.databind.ObjectMapper;

class ConvertToJson {

	@Test
	void testToJson() {
		Contact contact= new Contact(Long.valueOf(1), "Mr.","Walter", "M.","White", "","walter.white@yahoo.com","904-867-5309");
		ObjectMapper mapper= new ObjectMapper();
		try {
			String json=mapper.writeValueAsString(contact);
			System.out.printf("\n %s", json );
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testContact() {
		fail("Not yet implemented");
	}

	@Test
	void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testGetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMiddle() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLastName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSuffix() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEmail() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCellPhone() {
		fail("Not yet implemented");
	}

	@Test
	void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testSetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMiddle() {
		fail("Not yet implemented");
	}

	@Test
	void testSetLastName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSuffix() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEmail() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCellPhone() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
