import com.coderzoe.service.UserService;
import com.coderzoe.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/6/6 22:57
 * @description
 */
public class AspectTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test(){

        //这里有一个知识点，Spring动态代理代理的是接口。
        //所以这里返回的类型不能是UserServiceImpl 只能是UserService
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
        userServiceImpl.add();
    }

    /**
     * @data: 2020/06/06 23:40
     * @author: yhs
     * @return:
     * @description: 使用自定义的切面
     */
    @Test
    public void test2(){
        UserService userService = context.getBean("myService",UserService.class);
        userService.add();
    }
}
