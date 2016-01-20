package com.toyproject.model.toyproject.factory;

import com.toyproject.model.HelloWorld;
import com.toyproject.model.HelloWorldImpl;

/**
 * Created by WaiTuck on 20/01/2016.
 */
public class HelloWorldFactory {
    public static HelloWorld getHelloWorld(String type){
        switch (type){
            case "sysout":
                return new HelloWorldImpl();
            default:
                return new HelloWorldImpl();
        }
    }
}
