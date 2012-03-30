/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 100552T
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        StudentManagementSystem stdManagement = (StudentManagementSystem) context.getBean("stdManager");
        stdManagement.listAllStudents();
        
        System.out.println("\n\nAdding new Students\n\n");
        
        stdManagement.registerNewStudent(3, "Upeksha3", "Dimuthu3", "Home3");
        stdManagement.listAllStudents();
        context.stop();
    }

}
