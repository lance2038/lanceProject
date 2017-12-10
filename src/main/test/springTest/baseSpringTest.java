/*
package springTest;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

*/
/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe
 * @since 2017/11/22
 **//*

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class baseSpringTest
{
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;
    */
/**
     * 测试
     *//*

    @Test
    public  void testCRUD()
    {
        //1、插入几个部门
		*/
/*
		departmentMapper.insertSelective(new Department(3L, "业务一部"));
		departmentMapper.insertSelective(new Department(4L, "业务二部"));
        *//*

        //2、生成员工数据，测试员工插入

        */
/*
        employeeMapper.insertSelective(new Employee(131003L, "杰里米", "男", "hx131003@163.com", 3L));
        *//*


        //3、批量插入多个员工；批量，使用可以执行批量操作的sqlSession。
         EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for(int i = 0;i<1000;i++){
            String uid = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(Long.valueOf(i),uid, "M", uid+"@163.com", 4L));
        }
        System.out.println("end");

    }
}
*/
