package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestCase1 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddBcc() throws EmailException {
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
		system.out.println("TestAddBcc worked! -ozj___");
	}

	public testAddBccMult() throws EmailException {
		String [] emails = {"a@b.com", "b@c.com"};
		testEmail.addBcc(emails);
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
		system.out.println("TestAddBccMult worked! -ozj___");
	}
	public testAddCc() throws EmailExceptions {
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
		system.out.println("TestAddCc worked! -ozj___");
	}

}
