package com.lance.anInterface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(value = "cars")
    public String getAllCarMessage(
            @RequestParam(value = "pagenumber",defaultValue = "1") Integer pagenumber
    )
    {

        return null;
    }
}
