package com.example.demo;

import org.junit.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OutputTestsFlow {
    @InjectMocks

    @Mock
    ConvertString mockConvertString = mock(ConvertString.class);

    @Test
    public void givenOneCallConvertStringOnce() {
        //Given: I am a user
        given(mockConvertString.getResult("1")).willReturn(true);
        //When: I enter the number 1
        IConvertStringFlow ICSF = new ConvertStringFlow(mockConvertString);
        ICSF.getResult("1");
        
        //Then: ConvertString.getResult() will be called one time
        verify(mockConvertString, times(1)).getResult("1");
    }

}
