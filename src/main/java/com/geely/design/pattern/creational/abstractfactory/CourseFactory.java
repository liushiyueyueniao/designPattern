package com.geely.design.pattern.creational.abstractfactory;


/**
 * Created by geely
 *
 *
 * 课程 = 视频和文档  组成
 *
 *
 *  为什么不是生命一个包含 视频和文档的课程接口呢？
 *
 *  接口隔离原则  单一职责原则   灵活性  业务理解  拆分的粒度
 *
 *  文档和视频  是两个不同  而且可以独立的实体  只是聚合在一起的  每个都可以独立存在  这也是接口 粒度分离时一个重要的思考方向   产品族的概念
 *
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();

}
