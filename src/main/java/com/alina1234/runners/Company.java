package com.alina1234.runners;

/**
 * Created by agr on 6/20/2017.
 */
public enum Company {
    EBAY (30, "Ebay Inc"), GOOGLE(15, "Google Inc");
    private final int VALUE;
    private final String FULLNAME;

    Company(int value, String fullName){
        this.VALUE = value;
        this.FULLNAME = fullName;
    }

    public String getFULLNAME() {return FULLNAME;}

    public int getVALUE() { return VALUE;}

}
