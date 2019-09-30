#门面模式

提供一个统一的接口来访问子系统中的一群接口

定义了一个高层接口 让子系统更容易使用

类型：结构

子系统很复杂  


多层复杂系统  每层利用外观模式简化层间调用   最少知道

子系统的修改 会有风险

如果更新频繁  就需要设计的很复杂  多版本的外观类

org.springframework.jdbc.support.JdbcUtils

org.apache.ibatis.session.Configuration

RequestFacade

#装饰者
在不改变原有对象基础之前  将功能附加到对象之上

扩展对象功能  可以动态的添加或者撤销

结构型

装饰类就是功能类  多个装饰可以动态的实现和撤销

java.io.BufferedReader

org.springframework.cache.transaction.TransactionAwareCacheDecorator

javax.servlet.http.HttpServletRequestWrapper

#适配器模式

定义一个类的接口转换成客户期望的另一个接口

适配一些阻抗和不匹配的场景  复用现有的类

软件维护的方案

外观适配的更大  适配者更多的是接口  粒度不一样

