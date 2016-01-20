package com;

import com.toyproject.model.HelloWorld;
import com.toyproject.model.toyproject.factory.HelloWorldFactory;
import com.toyproject.model.toyproject.factory.HelloWorldTypeEnum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HelloWorld hw = HelloWorldFactory.getHelloWorld(HelloWorldTypeEnum.SYSOUT);
        hw.sayHelloWorld();
    }
}
