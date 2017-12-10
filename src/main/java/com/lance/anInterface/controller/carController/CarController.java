package com.lance.anInterface.controller.carController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lance.anInterface.bean.carsBean.Cars;
import com.lance.anInterface.bean.returnMSG;
import com.lance.anInterface.service.carService.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe
 * @since 2017/11/28
 **/
@Controller
@RequestMapping("/carHandler")
public class CarController
{
    @Resource
    CarService carService;
    @RequestMapping(value = "/cars")
    public returnMSG getAllCarMessage(
            @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize
    )
    {
        //设置分页 carCode
        PageHelper.startPage(pageNumber,pageSize);
        List<Cars> list = carService.getAllCars();
        PageInfo pi = new PageInfo(list);
        return returnMSG.success().add("pageInfo", pi);
    }
}
