# Spring学习
优点
* 轻量级
* 非侵入式

特点
* IOC 控制反转
* AOP 面向切面

七大模块:
* Spring Core
* Spring AOP
* Spring ORM
* Spring DAO
* Spring Web
* Spring Context
* Spring Web MVC

控制反转的一种实现方式是依赖注入(DI)  
依赖注入的三种方式：
* 构造器注入
* Set注入(重点)
* 其他方式

Spring三种自动装配
* 在XML中显示配置
* 在Java中显示配置
* 隐式自动状态(重点)

使用注解自动装配  
* @Autowired
* @Resource  
注解自动装配需要这个配置的属性在IOC容器中，比如Person类的Cat需要在xml文件中配置注入  
@Autowired会优先根据byType寻找容器中的类，如果包含多个类，则再会按byName寻找，
即会寻找Type相同，名字也相同的注入到容器中的类 如果byType包含多个类，但名字均与原来的类不同，
无法通过byName寻找到，可以通过@Qualifier(value = "bean id")来显示的指定要装配的类  
@Resource是Java自带的注解，会优先根据byName匹配，如果找不到这个Name，会再次根据类型寻找。
如果找name找不到，找type不唯一，可以通过@Resource(name = "bean id")来显示的指定要装配的类。

一些注解 
* @Component 组件 作用域类，说明这个类被Spring管理了(进入IOC容器)
* @Repository(dao层)
* @Service(service层)
* @Controller(controller层)  
上面三个注解与Component功能一样，就是名字不一样，方便MVC开发
* @Scope作用域注解 
    >singleton 单例  
    prototype原型  
    request  
    session  
    application  
    websocket 
* 
