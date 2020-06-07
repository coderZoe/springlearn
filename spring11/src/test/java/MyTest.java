import com.coderzoe.config.MyConfig;
import com.coderzoe.service.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yhs
 * @date 2020/6/7 0:07
 * @description
 */
public class MyTest {
    private ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    @Test
    public void test(){
        MyService myService = context.getBean("myService", MyService.class);
        myService.service();
    }
}
