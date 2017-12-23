import com.bdqn.pojo.Student;
import com.bdqn.service.student.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class StudentServiceImplTest1 {
    @Resource
    private StudentService studentService;
    @Test
    public void findAll() throws Exception {
        List<Student> students = studentService.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}