package base;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import domain.StudentDomainModel;

public class Person_Test {

	@Test
	public void testAddPerson(){
		PersonDAL test = new PersonDAL();
		PersonDomainModel t = new PersonDomainModel();
		t.setFirstName("Bill");
		t.setLastName("Burn");
		t.setPostalCode(07345);
		t.setCity("Jin");
		t.setStreet("Easy Street");
		assertEquals(test.addPerson(t),t);
	}
	
	@Test
	public void testGetStudents(){
		PersonDAL test = new PersonDAL();
		PersonDomainModel t = new PersonDomainModel();
		t.setFirstName("Bill");
		t.setLastName("Burn");
		t.setPostalCode(07345);
		t.setCity("Jin");
		t.setStreet("Easy Street");
		test.addPerson(t);
		ArrayList<PersonDomainModel> d = new ArrayList<PersonDomainModel>();
		d.add(t);
		assertEquals(test.getPersons(),d);
	}
	@Test
	public void testGetPerson(){
		PersonDAL test = new PersonDAL();
		PersonDomainModel t = new PersonDomainModel();
		t.setFirstName("Bill");
		t.setLastName("Burn");
		t.setPostalCode(07345);
		t.setCity("Jin");
		t.setStreet("Easy Street");
		test.addPerson(t);
		assertEquals(test.getPerson(t.getPerID()),t);
	}
	@Test
	public void testDeletePerson(){
		PersonDAL test = new PersonDAL();
		PersonDomainModel t = new PersonDomainModel();
		t.setFirstName("Bill");
		t.setLastName("Burn");
		t.setPostalCode(07345);
		t.setCity("Jin");
		t.setStreet("Easy Street");
		PersonDomainModel y = new PersonDomainModel();
		y.setFirstName("Bob");
		y.setLastName("Jack");
		y.setPostalCode(07325);
		y.setCity("Jin");
		y.setStreet("Easier Street");
		y.setPerID(UUID.randomUUID());
		test.addPerson(t);
		test.addPerson(y);
		ArrayList<PersonDomainModel> d = new ArrayList<PersonDomainModel>();
		d.add(t);
		d.add(y);
		test.deletePerson(t.getPerID());
		d.remove(1);
		assertEquals(test.getPersons(),d);
	}
	@Test
	public void testUpdatePerson(){
		PersonDAL test = new PersonDAL();
		PersonDomainModel t = new PersonDomainModel();
		t.setFirstName("Bill");
		t.setLastName("Burn");
		t.setPostalCode(07345);
		t.setCity("Jin");
		t.setStreet("Easy Street");
		assertEquals(test.updatePerson(t),t);
		
	}
	
}
