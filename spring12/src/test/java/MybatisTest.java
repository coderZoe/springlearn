import com.coderzoe.entity.User;
import com.coderzoe.mapper.UserMapper;
import com.coderzoe.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author yhs
 * @date 2020/6/7 9:55
 * @description
 */
public class MybatisTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println(users);
    }
}
