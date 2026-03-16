package pl.coderslab.advanced.abstractclass;

public class Employee extends User implements Payable{
    @Override
    public void pay() {
        System.out.println("paid");
    }
}
