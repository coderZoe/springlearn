import com.coderzoe.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/5/31 17:09
 * @description
 */
public class PersonTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    public void test(){
        Person person = context.getBean("person",Person.class);
        person.getDog().bark();
        person.getCat().bark();


        //xml自动装配 autowired
        Person person2 = context.getBean("person2",Person.class);
        person2.getDog().bark();
        person2.getCat().bark();

        //注解自动装配
        Person person3 = context.getBean("person3",Person.class);
        person3.getCat().bark();
        person3.getDog().bark();
    }
}
