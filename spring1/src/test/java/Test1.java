import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

/**
 * @author yhs
 * @date 2020/5/30 22:48
 * @description
 */
public class Test1 {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    @Test
    public void getUsers(){
        UserService userService = new UserServiceImpl();
        userService.getUsers();
    }

    @Test
    public void getUsersBySpring(){
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.getUsers();
    }
}
