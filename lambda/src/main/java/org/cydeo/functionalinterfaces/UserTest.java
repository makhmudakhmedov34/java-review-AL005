package org.cydeo.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(User.builder().age(30).firstName("Max").lastName("Fadeyev").build());
        userList.add(new User("Emran","Travolta",59));
        userList.add(new User("Butal","Hamroyev",45));
        userList.add(new User("Gevond","Shahzadov",37));

        System.out.println("Print all elements in the list");
       // printName(userList,p -> true);

        System.out.println("Print all users that last name starts with E");
        printName(userList,p->p.getFirstName().startsWith("E"));

    }

    private static void printName(List<User> users, Predicate<User> p){
        for(User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }

}
