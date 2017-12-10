package com.lance.anInterface.service.carService.impl;


import com.lance.anInterface.bean.carsBean.Cars;
import com.lance.anInterface.dao.carDao.CarsMapper;
import com.lance.anInterface.service.carService.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe
 * @since 2017/12/10
 **/
@Service
public class CarServiceImpl implements CarService
{
    @Autowired
    CarsMapper carsMapper;
    public List<Cars> getAllCars()
    {
        return carsMapper.selectByExample(null);
    }
}
