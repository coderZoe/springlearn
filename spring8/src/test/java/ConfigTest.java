import com.coderzoe.config.SpringConfig;
import com.coderzoe.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yhs
 * @date 2020/6/1 21:09
 * @description
 */
public class ConfigTest {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    @Test
    public void test(){
        User user = context.getBean("getUser", User.class);
        user.setName("yhs");
        System.out.println(user);
    }
}
