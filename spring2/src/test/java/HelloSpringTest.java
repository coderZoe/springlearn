import com.coderzoe.entity.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/5/31 10:43
 * @description
 */
public class HelloSpringTest {

    //获取Spring的上下文对象    配置文件配置
    //传入beans.xml配置文件  我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来即可
    private ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    /**
     * @data: 2020/05/31 10:59
     * @author: yhs
     * @return:
     * @description: 第一个Spring程序
     */
    @Test
    public void testSpring(){
        Hello hello = (Hello) context.getBean("hello"); //这个Hello类我们并没有new出来 而是通过SpringIOC的容器取出来的

        //传统应用程序中，对象是由程序本身创建的，使用Spring后，对象是由Spring创建的
        System.out.println(hello);
    }
}

