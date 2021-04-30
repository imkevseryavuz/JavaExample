package javaProjectThree.Managers;

import javaProjectThree.Models.User;

public class StudentManager extends UserManager{
@Override
    public void add(User user){
    System.out.println(user.getFirstName()+user.getLastName()+"kişi eklendi");
}
}
