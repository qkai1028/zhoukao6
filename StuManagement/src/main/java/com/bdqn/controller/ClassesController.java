package com.bdqn.controller;

import com.bdqn.pojo.Classes;
import com.bdqn.service.classes.ClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
@Controller
@RequestMapping("/classes")
public class ClassesController {
    @Resource
    private ClassesService classesService;

    @RequestMapping("/showAllClasses")
    public String showAllClasses(Model model) {
        List<Classes> classes = classesService.findAll();
        model.addAttribute("classes", classes);
        return "classesList";
    }
}
