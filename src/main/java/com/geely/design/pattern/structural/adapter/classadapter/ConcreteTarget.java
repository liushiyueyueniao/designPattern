package com.geely.design.pattern.structural.adapter.classadapter;

/**
 * 现有系统的接口实现   系统的线上功能
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
