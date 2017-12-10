package com.lance.anInterface.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lance.anInterface.bean.Employee;
import com.lance.anInterface.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe
 * @since 2017/11/22
 **/
@Controller
@RequestMapping("/Handler")
public class EmpController
{
    @Autowired
    empService empService;

    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/getEmps",method = RequestMethod.GET)
    public String getEmps(@RequestParam(value = "pageNumber",defaultValue = "1")Integer pageNumber,Model model)
    {
        PageHelper.startPage(pageNumber,10);
        List<Employee> empsList = empService.getAllEmps();
        PageInfo page = new PageInfo(empsList, 10);
        model.addAttribute("pageInfo", page);
        return "Emps/list";
    }
    @RequestMapping("/hello")
    public String hello()
    {
        return "Emps/hello";
    }
}
