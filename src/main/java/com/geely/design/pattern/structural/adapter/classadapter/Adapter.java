package com.geely.design.pattern.structural.adapter.classadapter;

/**
 * 让Adaptee可以满足需求   继承的方式  实现一个子类
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
