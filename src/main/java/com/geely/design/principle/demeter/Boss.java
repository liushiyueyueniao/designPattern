package com.geely.design.principle.demeter;


/**
 * boos 中 不应该知道Course的细节  直接 和 teamleader 交互
 *
 *
 * 返回值不应是就Course相关的    只在入参是和teamleader相关就可以  （函数入参依赖）  也可以是属性依赖（set方法注入和构造函数注入）
 *
 * 朋友是 teamleader 不应该是Course或者Course相关的
 *
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
