package user;

import java.util.ArrayList;

public class UserSever {
    ArrayList<User> users=new ArrayList<User>();

    public ArrayList<User> allUsers(){
        users.add(new Customer("Jubail","jubail11",
                "01878556482","12345",
                "Dhaka,Bangladesh","Customer"));

        users.add(new Shopper("Tusha","tusha05",
                "01748556482","11111",
                "Dhaka,Bangladesh","Shopper"));

        users.add(new SecurityGard("Abir","abir07",
                "01348556492","22222",
                "Dhaka,Bangladesh","Security Gard"));

        users.add(new Customer("Abadot","abadot07",
                "01448556492","33333",
                "Dhaka,Bangladesh","Customer"));

        return users;
    }
}
