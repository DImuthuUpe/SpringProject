/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import studentmanagement.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import studentmanagement.SimpleStudentRepository;
import studentmanagement.StudentManagementSystem;
import static org.junit.Assert.*;

/**
 *
 * @author pancha
 */
public class GetAllStudentsTest {
    
    public GetAllStudentsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetAllStudents(){
        Student s1 = new Student();
        s1.setNumber(1);
        s1.setFirstName("Upeksha1");
        s1.setLastName("Dimuthu1");
        s1.setAddress("Home1");
        Student s2 = new Student();
        s2.setNumber(2);
        s2.setFirstName("Upeksha2");
        s2.setLastName("Dimuthu2");
        s2.setAddress("Home2");
        Student s3 = new Student();
        s3.setNumber(3);
        s3.setFirstName("Upeksha3");
        s3.setLastName("Dimuthu3");
        s3.setAddress("Home3");
        
        SimpleStudentRepository studentRepository = new SimpleStudentRepository();
        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);
        
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.setStdRepo(studentRepository);
        
        List<Student> stdList= sms.listAllStudents();
        assertFalse("Errorrr  ", stdList.size()!=3);
    }
}
