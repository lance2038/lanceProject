package com.lance.anInterface.dao.carDao;

import com.lance.anInterface.bean.manufacturersBean.Manufacturers;
import com.lance.anInterface.bean.manufacturersBean.ManufacturersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturersMapper {
    long countByExample(ManufacturersExample example);

    int deleteByExample(ManufacturersExample example);

    int insert(Manufacturers record);

    int insertSelective(Manufacturers record);

    List<Manufacturers> selectByExample(ManufacturersExample example);

    int updateByExampleSelective(@Param("record") Manufacturers record, @Param("example") ManufacturersExample example);

    int updateByExample(@Param("record") Manufacturers record, @Param("example") ManufacturersExample example);
}