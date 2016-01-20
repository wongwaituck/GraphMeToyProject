package com.toyproject.model;

/**
 * Created by WaiTuck on 21/01/2016.
 */
public class HelloTextAdapter {
    private String helloWorldText;
    public static final HelloTextAdapter THE_HELLO_WORLD = new HelloTextAdapter("Hello World!");

    public HelloTextAdapter(String helloWorldText){
        this.helloWorldText = helloWorldText;
    }

    public String toString(){
        return helloWorldText;
    }
}

