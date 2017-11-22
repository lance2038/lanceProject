package com.lance.anInterface.dao;

import com.lance.anInterface.bean.Employee;
import com.lance.anInterface.bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);
    //me
    List<Employee> selectByExampleWithDept(EmployeeExample example);
    //me
    Employee selectByPrimaryKeyWithDept(Long empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);
}