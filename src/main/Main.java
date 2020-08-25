package main;

import org.apache.commons.mail.EmailException;

public class Main {

	public static void main(String[] args) throws EmailException, InterruptedException {
		LoginEmail em = new LoginEmail();
		em.LoginTest();

	}

}
