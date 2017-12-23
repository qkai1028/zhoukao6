package com.bdqn.service.student;

import com.bdqn.pojo.Student;

import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
public interface StudentService {
    List<Student> findAll();
    int addStudent(Student student);
}
