package com.alina1234.runners;

/**
 * Created by agr on 6/20/2017.
 */
public class enumRunner {
    public static void main(String[] args) {
        Company company = Company.values()[1];
        System.out.println(company.getFULLNAME()+ ' ' + company.getVALUE());

        }
}
