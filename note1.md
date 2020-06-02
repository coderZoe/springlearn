##个人关于IOC的理解  
IOC我们一般叫做控制反转(Inversion of Control)
所谓控制反转 就是控制权不交给使用资源的双方，而交给第三方来管理  
举个例子，你想在淘宝买个衣服，下单付完帐后，钱不是直接到了客户的手里，而是你把钱交给了支付宝，
等到货到之后，商家才能从支付宝得到属于他的钱。这其中，钱就属于我们的资源，而支付宝就是我们的IOC容器，
你和商家都属于使用资源的对象。你们之间没用依赖关系，你将钱给支付宝，支付宝帮你管理，商家再通过支付宝得到钱。这样你和商家之间就实现了解耦。  
将控制权交给第三方的都可以叫控制反转。  

其中控制反转实现的一种方式叫依赖注入: DI(Dependency Injection)  
依赖注入分为两个词：依赖和注入  
* 所谓依赖，就是我的实现得需要你，那么就是我依赖于你。比如Service层的实现需要Dao层(一般来说)，那么我们就说Service依赖Dao  
* 而注入是说，将这个依赖的对象交给第三方，由第三方来控制依赖对象的创建 你只需要从第三方来取这个对象 注入到自己的类中即可
这个第三方也就是我们说的**Spring容器** 他负责管理我们的依赖对象。

举个例子  
1.公司想让你给每个类加个日志 然后需要这些日志输出到文件里  
这时你可以简单暴力的做，在每个类加一个FileLog的对象，让这个对象去执行日志的输出
```java
public class Service1{
    private ILogger logger = new FileLogger();
    
    public void add(){
        logger.log("执行增加函数!!");
        //statement
        logger.log("增加函数执行完成!!");
    }
    public void delete(){
        logger.log("执行删除函数!!");
        //statement
        logger.log("删除函数执行完成!!");
    }
    public void update(){
        logger.log("执行修改函数!!");
        //statement
        logger.log("修改函数执行完成!!");
    }
    public void query(){
        logger.log("执行查询函数!!");
        //statement
        logger.log("查询函数执行完成!!");
    }
}
```
```java
public class ServiceN{
    private ILogger logger = new FileLogger();
    
    public void add(){
        logger.log("执行增加函数!!");
        //statement
        logger.log("增加函数执行完成!!");
    }
    public void delete(){
        logger.log("执行删除函数!!");
        //statement
        logger.log("删除函数执行完成!!");
    }
    public void update(){
        logger.log("执行修改函数!!");
        //statement
        logger.log("修改函数执行完成!!");
    }
    public void query(){
        logger.log("执行查询函数!!");
        //statement
        logger.log("查询函数执行完成!!");
    }
}
```
这样你在n个函数里加了日志功能，输出到文件 突然有一天需求变了，不再是输出到文件了，要求输出到控制台
这时你不可能去替换每个类里的log，而且就算这次全替换了，下次再改成打印输出到服务器怎么办？  
之所以这里每个类都需要改，是因为我们每个类依赖的日志功能都自己去实现了，那我们可不可以不自己实现，实现由统一的地方来控制。这样改的时候，我只需要改统一的地方就好了。  
这就是工厂设计模式。
```java
public class Service1{
    private ILogger logger = LoggerFactory.createLogger();
    
    public void add(){
        logger.log("执行增加函数!!");
        //statement
        logger.log("增加函数执行完成!!");
    }
    public void delete(){
        logger.log("执行删除函数!!");
        //statement
        logger.log("删除函数执行完成!!");
    }
    public void update(){
        logger.log("执行修改函数!!");
        //statement
        logger.log("修改函数执行完成!!");
    }
    public void query(){
        logger.log("执行查询函数!!");
        //statement
        logger.log("查询函数执行完成!!");
    }
}
```
```java
public class ServiceN{
    private ILogger logger = LoggerFactory.createLogger();
    
    public void add(){
        logger.log("执行增加函数!!");
        //statement
        logger.log("增加函数执行完成!!");
    }
    public void delete(){
        logger.log("执行删除函数!!");
        //statement
        logger.log("删除函数执行完成!!");
    }
    public void update(){
        logger.log("执行修改函数!!");
        //statement
        logger.log("修改函数执行完成!!");
    }
    public void query(){
        logger.log("执行查询函数!!");
        //statement
        logger.log("查询函数执行完成!!");
    }
}
```
```java
public class LoggerFactory {
	public static ILogger createLogger() {
		return new ServerLogger();
	}
}
```
看，这样我们就实现了控制反转，将log的创建不交给每个类来具体实现，而交给一个统一的第三方来实现。我们只需要找第三方要就好了，他给我们造。这样我们需求改了的时候，只需要改工厂方法即可。

但这样又会有问题：每一个类都需要日志功能，每一个类都需要第三方来new一个日志类，但其实每个日志类并没什么不同，这样会造成大量重复的日志类占用资源。那我可不可以将日志类设计为单例的呢？所有的创建都是来自同一个日志类。当然可以。  
```java
public class LoggerFactory {
    private static ILogger logger = new ServerLogger();
	public static ILogger createLogger() {
		return logger ;
	}
}
```
这样我们就只创建了一个日志对象，每次返回的都是他。

但很多时候，我们的需求是变动的不可预测的，如果这时候又有其他的依赖需要的不是单例，而是原型，那我们又得改。此时我们就引入了Spring
在Spring中，我们将依赖类进行托管，控制权交给Spring，我们只需要在每个类里注入依赖类即可 这样的好处前面也说了，我们并不关心这个依赖是怎么构建的或有没有，也不需要在我的代码里new一个依赖
我只需要直接拿来用即可  
```java
public class Service1{
    private ILogger logger;
    
    public void add(){
        logger.log("执行增加函数!!");
        //statement
        logger.log("增加函数执行完成!!");
    }
    public void delete(){
        logger.log("执行删除函数!!");
        //statement
        logger.log("删除函数执行完成!!");
    }
    public void update(){
        logger.log("执行修改函数!!");
        //statement
        logger.log("修改函数执行完成!!");
    }
    public void query(){
        logger.log("执行查询函数!!");
        //statement
        logger.log("查询函数执行完成!!");
    }
}
```
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="serverLogger" class="com.springnovel.perfectlogger.ServerLogger"/>
    <bean id="Service1" class="com.coderzoe.service.Service1">
        <property name="logger" ref="serverLogger"/>
    </bean>
</beans>
```
这样我们的类就只需要引入依赖，具体的创建和赋值，Spring帮你做好了(但你得在xml中配置)
