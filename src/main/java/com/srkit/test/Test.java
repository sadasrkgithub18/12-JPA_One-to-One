package com.srkit.test;

import java.time.LocalDate;

import com.srkit.dao.PersonDAO;
import com.srkit.dao.impl.PersonDAOImpl;
import com.srkit.entity.Passport;
import com.srkit.entity.Person;

public class Test {

	public static void main(String[] args)
	{
		
		PersonDAO dao = new PersonDAOImpl();
		
		// Call savePerson() 
		
		// Create person Instance
		
		/*
		 * Person person = new Person(); person.setPersnId(50505);
		 * person.setPersonName("Peter");
		 * 
		 * // Create passport Instance
		 * 
		 * Passport pass = new Passport(); pass.setPassportId(50000);
		 * pass.setExpireDate(LocalDate.of(2019, 5, 15));
		 * 
		 * person.setPassport(pass);
		 * 
		 * dao.savePerson(person);
		 */
		
		
		
		// Call fetchPerson()
		
		/*
		 * Person person = dao.fetchPerson(30303); System.out.println("Person Name :: "+
		 * person.getPersonName()); System.out.println("Person Passport ID :: "+
		 * person.getPassport().getPassportId());
		 * System.out.println("Person Passport Expiry :: "+
		 * person.getPassport().getExpireDate());
		 * 
		 */
		
		
		// Call removePerson()
		
		// dao.removePerson(20202);

	}

}
