package com.example.demo;

public class FlowTest implements IFlowTest {
    private IConvertString _ICS;
    private IRangeVal _IRV;
    private IGetFizzBuzz _IGFB;

    FlowTest(IConvertString ICS, IRangeVal IRV, IGetFizzBuzz IGFB) {
        _ICS = ICS;
        _IRV = IRV;
        _IGFB = IGFB;
    }

    public String getResult(String s) {
        boolean convertStringCheck = _ICS.getResult(s);
        if (convertStringCheck) {
            boolean rangeCheck = _IRV.getResult(Integer.parseInt(s));
            if (rangeCheck) {
                return _IGFB.getResult(Integer.parseInt(s));
            } else {
                return "Please enter a number between 1 and 300";
            }
        } else {
            return "Please enter a number in integer form";
        }
    }
}
