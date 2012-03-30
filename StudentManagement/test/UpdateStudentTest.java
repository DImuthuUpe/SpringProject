/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import studentmanagement.Student;
import studentmanagement.SimpleStudentRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pancha
 */
public class UpdateStudentTest {
    
    public UpdateStudentTest() {
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
    public void testUpdate(){
        SimpleStudentRepository smRepository = new SimpleStudentRepository();
        Student s1 = new Student();
        s1.setNumber(20);
        s1.setFirstName("Upeksha");
        s1.setLastName("Dimuthu");
        s1.setAddress("Home");
        smRepository.save(s1);
        s1.setAddress("Home2");
        smRepository.update(s1);
        Student s2= smRepository.find(20);
        assertEquals("Errorrr ", s1.getNumber(), s2.getNumber());
        assertEquals("Errorrr ", s1.getFirstName(), s2.getFirstName());
        assertEquals("Errorrr ", s1.getLastName(), s2.getLastName());
        assertEquals("Errorrr ", s1.getAddress(), s2.getAddress());
    }
}
