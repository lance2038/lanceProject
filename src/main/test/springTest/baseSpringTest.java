package springTest;

import com.lance.anInterface.bean.manufacturersBean.Manufacturers;
import com.lance.anInterface.dao.carDao.ManufacturersMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe
 * @since 2017/11/22
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class baseSpringTest
{
    @Autowired
    ManufacturersMapper manufacturersMapper;

    @Autowired
    SqlSession sqlSession;

    /**
     * 测试
     */
    @Test
    public  void testCRUD()
    {
        //插入制造商测试
        String uid = UUID.randomUUID().toString().substring(0,16);
        manufacturersMapper.insertSelective(new Manufacturers("4", "1", "Porsche", "保时捷", "德国", uid, ""));
    }
}
