package com.spingboot.data.mapper;

import com.spingboot.data.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * emp mapper接口类
 */
//@Mapper
public interface EmpMapper {

    public Employee getEmpById(Integer id);

    public int inertEmp(Employee employee);
}
