package com.benjamin.controller;

import com.benjamin.bean.Employee;
import com.benjamin.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SsmController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "ssm")
    public String ssm(){
        System.out.println(this.getClass().getName());
        Employee e = employeeDao.findByIdSelect(1);
        System.out.println(e);

        return "success";
    }
}
