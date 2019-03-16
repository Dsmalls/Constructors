package com.Section6;

public class VipPro {

    private String name;
    private double creditLimits;
    private String emailAddress;

    public VipPro(){
        this("Default name", 100000.00, "default@email.com");
    }

    public VipPro(String name, double creditLimits) {
        this(name, creditLimits, "unknown@email.com");
    }

    public VipPro(String name, double creditLimits, String emailAddress){
        this.name = name;
        this.creditLimits = creditLimits;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimits() {
        return creditLimits;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
