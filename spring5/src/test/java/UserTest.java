import com.coderzoe.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/5/31 14:14
 * @description
 */

public class UserTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
    @Test
    public void getTest(){
//        User user = (User) context.getBean("user");
        User user = context.getBean("user", User.class);
        System.out.println(user);

        User user1 = context.getBean("user2",User.class);
        System.out.println(user1);
    }

    /**
     * @data: 2020/05/31 14:36
     * @author: yhs
     * @return:
     * @description: Spring默认类作用域是单例模式 也就是一个Bean id无论get多少次 实际都是同一个对象
     *               通过下面的测试我们也可以发现 user并没有进行get和set 但user的属性还是包含了user3里设置过的内容
     *
     *               我们可以改变类作用域 在Spring中类作用域有6种
     *               1.singleton  单例
     *               2.prototype  原型(每次get一个Bean id都是一个新的对象 与之前不同)
     *               3.request
     *               4.session
     *               5.application
     *               6.websocket
     */
    @Test
    public void beanScope(){
        User user3 = context.getBean("user3", User.class);
        user3.setName("yhs");
        user3.setAge(18);
        System.out.println(user3);

        User user = context.getBean("user3",User.class);
        System.out.println(user);
        user.setName("coder");
        System.out.println(user3);
    }
}
