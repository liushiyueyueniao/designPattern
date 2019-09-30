package com.geely.design.pattern.creational.singleton;

/**
 *
 * 懒汉式
 *
 * 使用new关键字实例化对象
 *
 * 读取一个类的静态字段
 *
 * 设置一个类的静态字段
 *
 * 调用一个类的静态方法
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
