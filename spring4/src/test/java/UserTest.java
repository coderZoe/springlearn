import com.coderzoe.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/5/31 11:52
 * @description
 */
public class UserTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test(){
        System.out.println("进入test!!");
        User user = (User) context.getBean("user");
        System.out.println(user);

        User user2 = (User) context.getBean("user2");
        System.out.println(user2);
    }
}
