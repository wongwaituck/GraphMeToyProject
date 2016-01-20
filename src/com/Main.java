package com;

import com.toyproject.model.HelloWorld;
import com.toyproject.model.toyproject.factory.HelloWorldFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HelloWorld hw = HelloWorldFactory.getHelloWorld("sysout");
        hw.sayHelloWorld();
    }
}
