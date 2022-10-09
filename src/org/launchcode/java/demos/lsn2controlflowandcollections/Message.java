package org.launchcode.java.demos.lsn2controlflowandcollections;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else {
            return "Hello, World!";
        }

    }

}

/*
Static Typing:
public static returnedDataType methodName(parameterDataType parameterName) {
    code goes here
    }
 */
