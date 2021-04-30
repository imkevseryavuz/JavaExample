package javaProjectThree;

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
