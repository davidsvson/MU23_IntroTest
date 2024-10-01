package org.example;

public class TwoStrings {
    private String strOne;
    private String strTwo;


    public TwoStrings(String strOne, String strTwo) {
        this.strOne = strOne;
        this.strTwo = strTwo;
    }

    public String add()
    {
        return strOne + strTwo;
    }

    public String subtract()
    {
        if (strTwo.length() >= strOne.length())
            return "";

        return strOne.substring(strTwo.length());
    }


}
