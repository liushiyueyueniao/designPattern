package com.geely.design.pattern.structural.adapter.objectadapter;

/**
 *   不使用继承  而是组合Adaptee 的对象  依赖Adaptee对象现有客服用的功能
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
