package com.geely.design.pattern.structural.bridge;

/**
 *  银行  持有账户  打开账户（依赖于账户的打开）  组合模式  最少知道原则  朋友变量
 *
 *  抽象出来的业务模型的朋友对象  的设计
 *
 *  抽象类可以有属性
 *
 *  用抽象类和接口 来表示  实现业务需求  提供出来的方法，参数，返回值 （依赖组合）的属性
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
