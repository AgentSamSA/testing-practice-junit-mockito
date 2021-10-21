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

    public boolean getResult(String s) {
        boolean convertStringCheck = _ICS.getResult(s);
        if (convertStringCheck) {
            boolean rangeCheck = _IRV.getResult(Integer.parseInt(s));
            if (rangeCheck) {
            _IGFB.getResult(Integer.parseInt(s));
            }
        } else {
        return false;
        }
        return true;
    }
}
