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

#享元模式

提供了减少对象数量从而改善应用所需要的对象结构的方式

共享技术有效的支持大量细粒度的对象

结构性

String  解决性能问题   连接池  池化资源  底层开发 解决系统问题

减少对象的创建，降低内存中对象的数量 降低系统的内存  提高效率

减少内存之外的其他资源占用

关注内部外部状态  关注线程安全问题

逻辑复杂


内部状态  不会随着外部（环境）状态变化而变化的

外部状态

状态外部化  和内部化 

 IntegerCache
 
 LongCache
 
 org.apache.commons.pool2.impl.GenericKeyedObjectPool
 
#组合模式
将对象组合成树形结构以表示“部分和整体” 层次结构


组合模式是客户端对单个对象和组合对象保持一致的处理方式


结构类型


忽略组合对象和单个对象的差异时   树形结构

清楚的定义分层复杂对象  

限定类型
java.util.HashMap.putAll

org.apache.ibatis.scripting.xmltags.SqlNode


#桥接

抽象部分和与天气啊具体实现部分分离  使他们可以独立的变化

通过组合的方式建立两个类之间的联系 而不是继承

一个类存在两个或者多个独立变化的维度 且这两个或者多个维度都需要独立进行扩展

识别系统中两个独立变化的维度

#代理

为其他对象提供一种代理  以控制对这个对象的访问

代理对象在客户端和目标对象之前起到中介的作用

保护目标对象  增强目标对象  