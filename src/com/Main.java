package com;

import com.sun.tracing.dtrace.DependencyClass;
import com.toyproject.model.*;
import com.toyproject.model.toyproject.factory.HelloWorldFactory;
import com.toyproject.model.toyproject.factory.HelloWorldTypeEnum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HelloWorld hw = HelloWorldFactory.getHelloWorld(HelloWorldTypeEnum.SYSOUT);
        E e = new A().getB().getC().getD().getE();
        if(hw instanceof Hello){

        }
        hw.sayHelloWorld();
    }
}
