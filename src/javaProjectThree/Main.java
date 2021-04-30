package javaProjectThree;

import javaProjectThree.Managers.UserManager;
import javaProjectThree.Models.Instructor;
import javaProjectThree.Models.Student;
import javaProjectThree.Models.User;

public class Main {
    public static void main(String[] args){
    Student student1=new Student();
    student1.setId(1);
    student1.setFirstName("Kevser");
    student1.setLastName("Yavuz");
    student1.setStudentNumber("1212121");
    student1.setEmail("kevser@mail");
    student1.setPassword("abc");

   /* StudentManager studentManager=new StudentManager();
    studentManager.add(student1);*/

    Instructor instructor1=new Instructor();
    instructor1.setId(1);
    instructor1.setFirstName("Deneme");
    instructor1.setLastName("Deneme12");
    instructor1.setInstructorNo("12346");
    instructor1.setEmail("deneme@mail");
    instructor1.setPassword("qwert");

    /*InstructorManager instructorManager=new InstructorManager();
    instructorManager.add(instructor1);*/

        UserManager userManager=new UserManager();
        User[] users={student1,instructor1};
        userManager.addMultiple(users);
    }
}
