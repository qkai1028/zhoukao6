package com.bdqn.controller;

import com.bdqn.pojo.Classes;
import com.bdqn.pojo.Student;
import com.bdqn.service.classes.ClassesService;
import com.bdqn.service.student.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private ClassesService classesService;

    //显示学生列表
    @RequestMapping("/listAll.html")
    public String listAll(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "listAll";
    }

    //显示添加学员
    @RequestMapping("/showAdd.html")
    public String showAdd(Model model){
        List<Classes> classes = classesService.findAll();
        model.addAttribute("classes", classes);
        return "showAddStu";
    }

    //处理提交新增学员信息
    @RequestMapping(value = "/submit.html",method = RequestMethod.POST)
    public String submit(HttpServletRequest request, Model model) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Student student = new Student();
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String ageStr = request.getParameter("age");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");
        String classIdStr = request.getParameter("classId");
        student.setName(name);
        student.setGender(gender);
        student.setAge(Integer.parseInt(ageStr));
        student.setTelephone(telephone);
        student.setEmail(email);
        student.setClassId(Integer.parseInt(classIdStr));
        int result = studentService.addStudent(student);
        if (result <= 0) {
            model.addAttribute("message","添加学员信息失败！");
        }else{
            List<Student> students = studentService.findAll();
            model.addAttribute("students", students);
            model.addAttribute("message","添加学员信息成功！");
        }
        return "listAll";
    }
}
