package com.lance.anInterface.dao;

import com.lance.anInterface.bean.car.Cars;
import com.lance.anInterface.bean.car.CarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarsMapper {
    long countByExample(CarsExample example);

    int deleteByExample(CarsExample example);

    int insert(Cars record);

    int insertSelective(Cars record);

    List<Cars> selectByExample(CarsExample example);

    int updateByExampleSelective(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByExample(@Param("record") Cars record, @Param("example") CarsExample example);
}