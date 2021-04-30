package javaProjectThree.Managers;

import javaProjectThree.Models.User;

public class UserManager {
    public void add(User user){
        System.out.println(user.getEmail());
    }

    public void addMultiple(User[] users){
        for (User user:users){
            add(user);
        }
    }
}
