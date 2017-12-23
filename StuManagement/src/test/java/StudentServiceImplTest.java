import com.bdqn.pojo.Student;
import com.bdqn.service.student.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by hp on 2017/12/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class StudentServiceImplTest {
    @Resource
    private StudentService studentService;

    @Test
    public void addStudent() throws Exception {
        Student student = new Student();
        student.setName("宋含蛇");
        student.setAge(13);
        student.setGender("女");
        student.setTelephone("13621083297");
        student.setEmail("snake@sina.com");
        student.setClassId(1);
        int result = studentService.addStudent(student);
        if (result > 0) {
            System.out.println("添加成功！");
        }
    }

}