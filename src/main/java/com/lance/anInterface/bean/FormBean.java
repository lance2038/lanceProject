package com.lance.anInterface.bean;

/**
 * Created by Administrator on 2017-08-11.
 */
public class FormBean {

    private String card_code;//供热卡卡号
    private String community_code;//小区编号
    private String addr;//门牌号：楼号-单元-层房号
    private String house_code;//房屋编码
    private String wx_openid;//微信用户号
    private String order_code;//订单流水号
    private String order_money;//金额
    private String order_time;//支付时间 yyyy-MM-dd hh24:mi:ss
    private String house_year;//年度
    private String username;//用户名称
    private String usermobile;//用户电话
    private String house_number;//房屋表号
    private String house_area;//房屋面积

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getHouse_area() {
        return house_area;
    }

    public void setHouse_area(String house_area) {
        this.house_area = house_area;
    }

    public String getCard_code() {
        return card_code;
    }

    public void setCard_code(String card_code) {
        this.card_code = card_code;
    }

    public String getCommunity_code() {
        return community_code;
    }

    public void setCommunity_code(String community_code) {
        this.community_code = community_code;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getHouse_code() {
        return house_code;
    }

    public void setHouse_code(String house_code) {
        this.house_code = house_code;
    }

    public String getWx_openid() {
        return wx_openid;
    }

    public void setWx_openid(String wx_openid) {
        this.wx_openid = wx_openid;
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code;
    }

    public String getOrder_money() {
        return order_money;
    }

    public void setOrder_money(String order_money) {
        this.order_money = order_money;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getHouse_year() {
        return house_year;
    }

    public void setHouse_year(String house_year) {
        this.house_year = house_year;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile;
    }
}
