import com.coderzoe.dao.UserMapper1;
import com.coderzoe.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/6/7 14:46
 * @description
 */
public class SpringTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test(){
        UserMapper1 userMapperImpl = context.getBean("userMapperImpl", UserMapper1.class);
        System.out.println(userMapperImpl.getUsers());
    }

    @Test
    public void test2(){
        UserMapper1 userMapper1 = context.getBean("userMapperImpl",UserMapper1.class);
        userMapper1.addUser(new User(100L,"Spring","SpringNb"));
        System.out.println(userMapper1.getUsers());
    }
}
