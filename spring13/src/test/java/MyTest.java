import com.coderzoe.dao.UserDao;
import com.coderzoe.dao.UserMapperImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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
}
