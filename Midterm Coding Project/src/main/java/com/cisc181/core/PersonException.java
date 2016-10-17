package com.cisc181.core;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.core.Person;

public class PersonException extends Exception {
	

	public void getDate() throws PersonException {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
	
	if((birthDate.get(Calendar.YEAR) + 100) <= (today.get(Calendar.YEAR))) {
		throw new PersonException();
	}
	}
	
	public void getNumber() throws PersonException {
		String phoneNumber = new String();
	
		
	}
}
	
