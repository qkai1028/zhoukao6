package com.bdqn.service.classes;

import com.bdqn.dao.classes.ClassesMapper;
import com.bdqn.pojo.Classes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
@Service
public class ClassesServiceImpl implements ClassesService {
    @Resource
    private ClassesMapper classesMapper;
    @Override
    public List<Classes> findAll() {
        return classesMapper.findAll();
    }
}
