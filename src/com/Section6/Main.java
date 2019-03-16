package com.Section6;

public class Main {

    public static void main(String[] args) {
        // A constructor in Java is a block of code similar to a method that's called when an
        // instance of an object is created. Here are the key differences between a constructor and a method: A constructor
        // doesn't have a return type. The name of the constructor must be the same as the name of the class.

        Account jayAccount = new Account("1234567", 0.00, "Jay Lewis", "jayemail@getsome.com", "555.255.5587");
        System.out.println(jayAccount.getBalance());
        System.out.println(jayAccount.getCustomerEmailAddress());
        System.out.println(jayAccount.getCustomerPhoneNumber());
        System.out.println("======================================");
        jayAccount.withdrawal(100.00);

        jayAccount.deposit(50.00);
        jayAccount.withdrawal(100.00);

        jayAccount.deposit(51.00);
        jayAccount.withdrawal(100.00);
        System.out.println("========================================");

        // new class VipCustomer
        // 3 fields name, credit limit, and email address.
        // 3 constructors
        // 1st constructor empty will call the constructor with 3 parameters with default values
        // 2nd constructor will pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor will save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        

        VipPro professional1 = new VipPro();
        System.out.println(professional1.getName());

        VipPro professional2 = new VipPro("Ryan", 25000.00);
        System.out.println(professional2.getName());

        VipPro professional3 = new VipPro("Alex", 100.00, "alex@email.com");
        System.out.println(professional3.getName());
        System.out.println(professional3.getEmailAddress());
    }
}
