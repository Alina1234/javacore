package com.alina1234.app.homework.lesson12;

/**
 * Created by agr on 6/18/2017.
 */
public class WhiteCollar extends Human {

    private String company;

    public WhiteCollar(String name, int age, String company) {
        super(name, age);
        setCompany(company);
    }

    public void setCompany (String userCompany){
        if (userCompany.matches("[a-zA-Z -]+")) {
            this.company = userCompany;
        }
        else System.out.println("Company name is invalid");
    }
}
