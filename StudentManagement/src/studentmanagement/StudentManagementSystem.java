/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import studentmanagement.Student;


/**
 *
 * @author pancha
 */
public class StudentManagementSystem {
    private SimpleStudentRepository stdRepo;
    public List<Student> listAllStudents(){
        Map<Integer,Student> students= stdRepo.getStudents();
        Set<Integer> keys = students.keySet();
        Iterator<Integer> iterator= keys.iterator();
        List<Student> stdList = new ArrayList<Student>();
        while(iterator.hasNext()){
            int key=iterator.next();
            stdList.add(students.get(key));
            System.out.println("User no : "+students.get(key).getNumber() );
            System.out.println("User first name : "+students.get(key).getFirstName() );
            System.out.println("User last name : "+students.get(key).getLastName() );
            System.out.println("User address : "+students.get(key).getAddress() );
            System.out.println("//////////////////////////////");
        }
        return stdList;
    }
    
    public void registerNewStudent(int no,String firstName,String lastName, String address){
        Student st = new Student();
        st.setNumber(no);
        st.setFirstName(firstName);
        st.setLastName(lastName);
        st.setAddress(address);
        stdRepo.save(st);
    }

    public SimpleStudentRepository getStdRepo() {
        return stdRepo;
    }

    public void setStdRepo(SimpleStudentRepository stdRepo) {
        this.stdRepo = stdRepo;
    }
    
    
    
}
