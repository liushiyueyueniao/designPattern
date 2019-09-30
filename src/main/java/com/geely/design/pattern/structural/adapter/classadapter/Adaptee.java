package com.geely.design.pattern.structural.adapter.classadapter;

/**
 * 现有系统的功能  但是不满足需求
 */
public class Adaptee {
    public void adapteeRequest(){
        System.out.println("被适配者的方法");
    }

}
