package com.bdqn.service.student;

import com.bdqn.dao.student.StudentMapper;
import com.bdqn.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }
}
