package com.geely.design.principle.openclose;

/**
 * Created by geely
 *
 *
 * 里式替换原则
 *
 * 不能重写父类的方法
 *
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

}
