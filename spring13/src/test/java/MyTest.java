import com.coderzoe.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/6/7 10:46
 * @description
 */
public class MyTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test1(){
        UserDao userMapperImpl = context.getBean("userMapperImpl", UserDao.class);
        System.out.println(userMapperImpl.getUsers());
    }

    @Test
    public void test2(){
        UserDao userMapperImpl2 = context.getBean("userMapperImpl2", UserDao.class);
        System.out.println(userMapperImpl2.getUsers());
    }
}
