package com.geely.design.principle.compositionaggregation;

/**
 *
 * DAO 的实现是组合/聚合依赖抽象接口  来提供多种方式来注入（属性可以 set方法，构造函数，非属性可以函数参数依赖）具体的实现类
 *
 */
public class ProductDao{
//    属性依赖抽象类 可以提供set方法设置  也可以是构造函数依赖  也可以是函数参数依赖  组合这些类
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
