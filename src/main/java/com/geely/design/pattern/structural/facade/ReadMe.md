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