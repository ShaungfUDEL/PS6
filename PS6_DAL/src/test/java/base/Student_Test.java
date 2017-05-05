package base;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.StudentDomainModel;

public class Student_Test {

	@Test
	public void testAddStudent(){
		StudentDAL test = new StudentDAL();
		StudentDomainModel t = new StudentDomainModel("Bill","Buddy","Burn",new Date());
		assertEquals(test.addStudent(t),t);
	}
	@Test
	public void testGetStudents(){
		StudentDAL test = new StudentDAL();
		StudentDomainModel t = new StudentDomainModel("Bill","Buddy","Burn",new Date());
		test.addStudent(t);
		ArrayList<StudentDomainModel> d = new ArrayList<StudentDomainModel>();
		d.add(t);
		assertEquals(test.getStudents(),d);
	}
	@Test
	public void testGetStudent(){
		StudentDomainModel t = new StudentDomainModel("Bill","Buddy","Burn",new Date());
		StudentDAL.addStudent(t);
		assertEquals(StudentDAL.getStudent(t.getStudentID()),t);
	}
	@Test
	public void testDeleteStudent(){
		StudentDomainModel t = new StudentDomainModel("Bill","Buddy","Burn",new Date());
		StudentDAL.addStudent(t);
		StudentDAL.deleteStudent(t.getStudentID());
		assertEquals(StudentDAL.getStudents(),null);
	}

}
