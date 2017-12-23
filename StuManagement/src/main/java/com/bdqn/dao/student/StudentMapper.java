package com.bdqn.dao.student;

import com.bdqn.pojo.Student;

import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
public interface StudentMapper {
    //查询所有学生列表
    List<Student> findAll();
    //新增学员
    int addStudent(Student student);
}
