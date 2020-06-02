import com.coderzoe.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/6/1 20:32
 * @description
 */
public class UserTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test(){
        User user = context.getBean("user", User.class);
        user.setName("yhs");
        System.out.println(user);
    }
}
