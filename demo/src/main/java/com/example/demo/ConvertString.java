package com.example.demo;

public class ConvertString implements IConvertString {
    public boolean getResult(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
