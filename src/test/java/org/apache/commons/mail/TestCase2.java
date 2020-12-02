package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestCase2 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddBcc() throws EmailException {
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
		System.out.println("TestAddBcc worked! -ozj___");
	}

	public void testAddBccMult() throws EmailException {
		String [] emails = {"a@b.com", "b@c.com"};
		testEmail.addBcc(emails);
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
		System.out.println("TestAddBccMult worked! -ozj___");
	}
	public void testAddCc() throws EmailExceptions {
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
		System.out.println("TestAddCc worked! -ozj___");
	}

}
