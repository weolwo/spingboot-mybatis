package com.spingboot.data.pojo;

public class Department {

    private Integer id;
    private String deptname;

    public void setId(Integer id) {
        this.id = id;
    }



    public Integer getId() {
        return id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
