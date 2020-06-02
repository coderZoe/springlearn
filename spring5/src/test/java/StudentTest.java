import com.coderzoe.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/5/31 12:45
 * @description
 */
public class StudentTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    @Test
    public void test(){
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
