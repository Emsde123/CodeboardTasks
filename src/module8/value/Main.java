package module8.value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Value val = new Value();
        System.out.println(val.getVal());
        System.out.println("Enter value for the set ");
        val.setVal(sc.nextInt());
        System.out.println(val.getVal());
        System.out.println(val.wasModified());

        System.out.println("Enter value for the constructor ");
        Value val1 = new Value(sc.nextInt());
        System.out.println(val1.getVal());
        System.out.println(val1.wasModified());
        Value val2 = new Value();
        System.out.println("Enter new  value for the set ");
        val2.setVal(sc.nextInt());
        System.out.println(val2.getVal());
        System.out.println(val2.wasModified());


    }
}
