package com.example.demo;

import org.junit.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestsFlow {
    @InjectMocks

    @Mock
    IConvertString mockConvertString = mock(IConvertString.class);

    @Mock
    IRangeVal mockRangeVal = mock(IRangeVal.class);

    @Mock
    IGetFizzBuzz mockGetFizzBuzz = mock(IGetFizzBuzz.class);

    @Test
    public void givenOneCallConvertStringOnce() {
        //Given: I am a user
        given(mockConvertString.getResult("1")).willReturn(true);
        given(mockRangeVal.getResult(1)).willReturn(true);
        given(mockGetFizzBuzz.getResult(1)).willReturn("1");
        //When: I enter the number 1
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("1");
        //Then: ConvertString.getResult() will be called one time
        verify(mockConvertString, times(1)).getResult("1");
    }

    @Test
    public void givenOneCallRangeValOnce() {
        //Given: I am a user
        given(mockConvertString.getResult("1")).willReturn(true);
        given(mockRangeVal.getResult(1)).willReturn(true);
        given(mockGetFizzBuzz.getResult(1)).willReturn("1");
        //When: I enter the number 1
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("1");
        //Then: ConvertString.getResult() will be called one time
        verify(mockRangeVal, times(1)).getResult(1);
    }

    @Test
    public void givenOneCallGetFizzBuzzOnce() {
        //Given: I am a user
        given(mockConvertString.getResult("1")).willReturn(true);
        given(mockRangeVal.getResult(1)).willReturn(true);
        given(mockGetFizzBuzz.getResult(1)).willReturn("1");
        //When: I enter the number 1
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("1");
        //Then: ConvertString.getResult() will be called one time
        verify(mockGetFizzBuzz, times(1)).getResult(1);
    }

    @Test
    public void givenZeroCallConvertStringOnce() {
        //Given: I am a user
        given(mockConvertString.getResult("0")).willReturn(true);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("0");
        //When: I enter the number 0
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("0");
        //Then: ConvertString.getResult() will be called one time
        verify(mockConvertString, times(1)).getResult("0");
    }

    @Test
    public void givenZeroCallRangeValOnce() {
        //Given: I am a user
        given(mockConvertString.getResult("0")).willReturn(true);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("0");
        //When: I enter the number 0
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("0");
        //Then: RangeVal.getResult() will be called one time
        verify(mockRangeVal, times(1)).getResult(0);
    }

    @Test
    public void givenZeroCallGetFizzBuzzZeroTimes() {
        //Given: I am a user
        given(mockConvertString.getResult("0")).willReturn(true);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("0");
        //When: I enter the number 0
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("0");
        //Then: GetFizzBuzz.getResult() will be called zero times
        verify(mockGetFizzBuzz, times(0)).getResult(0);
    }

    @Test
    public void givenStringFiveCallConvertStringOnce() {
        //Given: I am a user
        given(mockConvertString.getResult("five")).willReturn(false);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("0");
        //When: I enter the string "five"
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("five");
        //Then: ConvertString.getResult() will be called once times
        verify(mockConvertString, times(1)).getResult("five");
    }
    
    @Test
    public void givenStringFiveCallRangeValZeroTimes() {
        //Given: I am a user
        given(mockConvertString.getResult("five")).willReturn(false);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("0");
        //When: I enter the string "five"
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("five");
        //Then: RangeVal.getResult() will be called once times
        verify(mockRangeVal, times(0)).getResult(0);
    }
    
    @Test
    public void givenStringFiveCallGetFizzBuzzZeroTimes() {
        //Given: I am a user
        given(mockConvertString.getResult("five")).willReturn(false);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("0");
        //When: I enter the string "five"
        IFlowTest IFT = new FlowTest(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFT.getResult("five");
        //Then: GetFizzBuzz.getResult() will be called once times
        verify(mockGetFizzBuzz, times(0)).getResult(0);
    }
}
