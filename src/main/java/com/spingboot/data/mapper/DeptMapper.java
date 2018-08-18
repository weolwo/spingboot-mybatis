package com.spingboot.data.mapper;

import com.spingboot.data.pojo.Department;
import org.apache.ibatis.annotations.*;

import javax.annotation.Generated;

/**
 * 部门持久层mapper接口
 */
//@Mapper
public interface DeptMapper {

    @Select("select * from dept where id=#{id}")
    public Department selecet(Integer id);

    //增加这个注解插入记录后会返回自增长的id
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into dept(deptname) values(#{deptname})")
    public int insert(Department department);

    @Update("update dept set deptname=#{deptname} where id=#{id}")
    public int update(Department department);

    @Delete("delete from dept where id=#{id}")
    public int delete(Integer id);
}
