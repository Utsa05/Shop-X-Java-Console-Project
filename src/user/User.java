package user;

import shop.ShopHome;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    public String name;
    public String id;
    public String phoneNo;
    public String password;
    public String address;
    public String type;

    public User(String name, String id, String phoneNo, String password, String address, String type) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.password = password;
        this.address = address;
        this.type = type;
    }

    private final Scanner input=new Scanner(System.in);

    public void login(){
        UserSever userSever=new UserSever();
       ArrayList<User> users= userSever.allUsers();

        System.out.print("Enter Name:");
        this.name=input.nextLine().toUpperCase();

        System.out.print("Enter Password:");
        this.password=input.nextLine().toUpperCase();

        boolean isUserFound=false;
        User currentUser=new User("","","","","","");

        for (int i = 0; i < users.size(); i++) {
            if (!name.equals(users.get(i).name.toUpperCase())) {
                isUserFound = false;

            } else if (!password.equals(users.get(i).password.toUpperCase())) {
                isUserFound = false;

            } else {

                isUserFound=true;
                currentUser= new User(users.get(i).name,users.get(i).id,
                        users.get(i).phoneNo,users.get(i).password,users.get(i).address,users.get(i).type);
                break;


            }
        }
        if (!isUserFound) {
            System.out.println("Somethign wrong with username or password");
        } else {
            ShopHome shopHome=new ShopHome();
            shopHome.showShopHomeFeatures(currentUser);



        }


    }

}
