package com.spingboot.data.controller;

import com.spingboot.data.mapper.DeptMapper;
import com.spingboot.data.mapper.EmpMapper;
import com.spingboot.data.pojo.Department;
import com.spingboot.data.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 员工操作控制类
 */
@RestController//表示所有数据都已json格式输出
public class EmpController {

    @Autowired
    private EmpMapper empMapper;

    //根据id查询员工
    @GetMapping("/emp/{id}")//基于restful风格的url
    public Employee getDept(@PathVariable("id") Integer id) {

        return  empMapper.getEmpById(id);
    }

    @GetMapping("emp")
    public Employee insertDept(Employee employee){
    //restful风格插入数据示例http://localhost:8080/emp?lastName=bob&gender=1&email=bob@qq.com&dId=2
        empMapper.inertEmp(employee);
        return employee;
    }
}
