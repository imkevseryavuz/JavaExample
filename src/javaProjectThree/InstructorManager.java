package javaProjectThree;

public class InstructorManager extends UserManager {
    @Override
    public void add(User user){
        System.out.println(user.getFirstName()+user.getLastName()+"kişi eklendi");
    }
}
