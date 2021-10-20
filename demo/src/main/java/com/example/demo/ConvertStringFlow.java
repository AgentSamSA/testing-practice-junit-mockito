package com.example.demo;

public class ConvertStringFlow implements IConvertStringFlow {
    private IConvertString _ICS;

    ConvertStringFlow(IConvertString ICS) {
        _ICS = ICS;
    }

    public String getResult(String s) {
        _ICS.getResult(s);
        return "";
    }
}
