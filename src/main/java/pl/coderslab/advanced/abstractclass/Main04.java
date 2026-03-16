package pl.coderslab.advanced.abstractclass;


import java.util.ArrayList;

public class Main04 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        Company com = new Company();
        Company com2 = new Company();
        Company com3 = new Company();
        Company com4 = new Company();

        users.add(emp);
        users.add(emp2);
        users.add(com);
        users.add(com2);
        users.add(com3);
        users.add(com4);
        users.add(emp3);
        users.add(emp4);
        
        for (User user : users){
            if (user instanceof Payable){
                ((Payable)user).pay();
            }else{
                System.out.println("not paid");
            }
        }

    }





}
