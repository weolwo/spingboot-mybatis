package com.spingboot.data.controller;

import com.spingboot.data.mapper.DeptMapper;
import com.spingboot.data.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门操作控制类
 */
@RestController//表示所有数据都已json格式输出
public class DeptController {
    @Autowired
    private DeptMapper deptMapper;

    //根据id查询部门
    @GetMapping("/dept/{id}")//基于restful风格的url
    public Department getDept(@PathVariable("id") Integer id) {
        Department department = deptMapper.selecet(id);
        return department;
    }

    @GetMapping("dept")
    public Department insertDept(Department department){

        deptMapper.insert(department);

        return department;
    }
}
