package com.bdqn.dao.classes;

import com.bdqn.pojo.Classes;

import java.util.List;

/**
 * Created by hp on 2017/12/11.
 */
public interface ClassesMapper {
    //查询所有班级
    List<Classes> findAll();
}
