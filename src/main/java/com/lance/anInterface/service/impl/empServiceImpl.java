package com.lance.anInterface.service.impl;

import com.lance.anInterface.bean.Employee;
import com.lance.anInterface.dao.EmployeeMapper;
import com.lance.anInterface.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe
 * @since 2017/11/22
 **/
@Service
public class empServiceImpl implements empService
{
    @Autowired
    EmployeeMapper employeeMapper;
    public List<Employee> getAllEmps()
    {
        return employeeMapper.selectByExampleWithDept(null);
    }
}
