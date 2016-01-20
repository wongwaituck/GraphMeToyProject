package com.toyproject.model.toyproject.factory;

import com.toyproject.model.HelloWorld;
import com.toyproject.model.HelloWorldImpl;

import static com.toyproject.model.toyproject.factory.HelloWorldTypeEnum.SYSOUT;

/**
 * Created by WaiTuck on 20/01/2016.
 */
public class HelloWorldFactory {
    public static HelloWorld getHelloWorld(HelloWorldTypeEnum type){
        switch (type){
            case SYSOUT:
                return new HelloWorldImpl();
            default:
                return new HelloWorldImpl();
        }
    }
}
