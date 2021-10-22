package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "iGetFizzBuzz")
    public IGetFizzBuzz createGetFizzBuzz() {
        return new GetFizzBuzz();
    }

    @Bean(name = "iRangeVal")
    public IRangeVal createRangeVal() {
        return new RangeVal();
    }
    
    @Bean(name = "iConvertString")
    public IConvertString createConvertString() {
        return new ConvertString();
    }

    @Bean(name = "iFlowTest")
    public IFlowTest createFlowTest() {
        return new FlowTest(createConvertString(), createRangeVal(), createGetFizzBuzz());
    }
}
