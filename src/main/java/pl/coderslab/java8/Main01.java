package pl.coderslab.java8;

public class Main01 {
    public static void main(String[] args) {

        //pierwsza wersja klasa anonimowa
        Check<Integer, Boolean> check = new Check<Integer, Boolean>() {
            public Boolean check(Integer n) {
                if (n >= 0 && n <= 100) {
                    return true;
                }
                return false;
            }
        };

        System.out.println(check.check(5));
        System.out.println(check.check(-1));
        System.out.println(check.check(104));
        System.out.println("------------");

        //druga wersja lepsza z lambda
        Check<Integer, Boolean> check2 = n -> n >= 0 && n <= 100;
        System.out.println(check2.check(5));
        System.out.println(check2.check(-1));
        System.out.println(check2.check(104));
    }
}
