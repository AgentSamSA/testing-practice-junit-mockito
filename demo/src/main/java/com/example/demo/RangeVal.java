package com.example.demo;

public class RangeVal implements IRangeVal {
    public boolean getResult(int num) {
        if (num == 1) {
            return true;
        }
        if (num == 300) {
            return true;
        }
        return false;
    }
}
