package com.lance.anInterface.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe 信息返回bean
 * @since 2017/12/10
 **/
public class returnMSG
{
    //返回状态码
    private int code;

    //返回信息
    private String msg;

    //返回显示数据
    private Map<String, Object> model = new HashMap<String, Object>();
    //处理成功
    public static returnMSG success()
    {
        returnMSG result = new returnMSG();
        result.setCode(100);
        result.setMsg("处理成功！");
        return result;
    }
    //处理失败
    public static returnMSG fail(){
        returnMSG result = new returnMSG();
        result.setCode(200);
        result.setMsg("处理失败！");
        return result;
    }
    //返回信息添加
    public returnMSG add(String key,Object value){
        this.getModel().put(key, value);
        return this;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Map<String, Object> getModel()
    {
        return model;
    }

    public void setModel(Map<String, Object> model)
    {
        this.model = model;
    }
}
