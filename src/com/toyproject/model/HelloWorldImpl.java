package com.toyproject.model;

/**
 * Created by WaiTuck on 20/01/2016.
 */
public class HelloWorldImpl extends Hello implements HelloWorld {
    public void sayHelloWorld(){
        System.out.println(HELLO_TEXT);
    }
}
