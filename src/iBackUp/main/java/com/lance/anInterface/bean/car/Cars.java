package com.lance.anInterface.bean.car;

import com.lance.anInterface.bean.Manufacturers;

import java.math.BigDecimal;

public class Cars
{
    private String carCode;

    private String enName;

    private String zhName;

    private BigDecimal weight;

    private BigDecimal power;

    private String enginetype;

    private BigDecimal enginedisplacement;

    private BigDecimal maxspeed;

    private BigDecimal accelerate;

    private BigDecimal price;

    private String carlevel;

    private String designer;

    private String tuner;

    private String manufacturedate;

    private String describ;

    private Manufacturers manufacturers;

    public Manufacturers getManufacturers()
    {
        return manufacturers;
    }

    public void setManufacturers(Manufacturers manufacturers)
    {
        this.manufacturers = manufacturers;
    }

    public String getCarCode()
    {
        return carCode;
    }

    public void setCarCode(String carCode)
    {
        this.carCode = carCode == null ? null : carCode.trim();
    }

    public String getEnName()
    {
        return enName;
    }

    public void setEnName(String enName)
    {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getZhName()
    {
        return zhName;
    }

    public void setZhName(String zhName)
    {
        this.zhName = zhName == null ? null : zhName.trim();
    }

    public BigDecimal getWeight()
    {
        return weight;
    }

    public void setWeight(BigDecimal weight)
    {
        this.weight = weight;
    }

    public BigDecimal getPower()
    {
        return power;
    }

    public void setPower(BigDecimal power)
    {
        this.power = power;
    }

    public String getEnginetype()
    {
        return enginetype;
    }

    public void setEnginetype(String enginetype)
    {
        this.enginetype = enginetype == null ? null : enginetype.trim();
    }

    public BigDecimal getEnginedisplacement()
    {
        return enginedisplacement;
    }

    public void setEnginedisplacement(BigDecimal enginedisplacement)
    {
        this.enginedisplacement = enginedisplacement;
    }

    public BigDecimal getMaxspeed()
    {
        return maxspeed;
    }

    public void setMaxspeed(BigDecimal maxspeed)
    {
        this.maxspeed = maxspeed;
    }

    public BigDecimal getAccelerate()
    {
        return accelerate;
    }

    public void setAccelerate(BigDecimal accelerate)
    {
        this.accelerate = accelerate;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public String getCarlevel()
    {
        return carlevel;
    }

    public void setCarlevel(String carlevel)
    {
        this.carlevel = carlevel == null ? null : carlevel.trim();
    }

    public String getDesigner()
    {
        return designer;
    }

    public void setDesigner(String designer)
    {
        this.designer = designer == null ? null : designer.trim();
    }

    public String getTuner()
    {
        return tuner;
    }

    public void setTuner(String tuner)
    {
        this.tuner = tuner == null ? null : tuner.trim();
    }

    public String getManufacturedate()
    {
        return manufacturedate;
    }

    public void setManufacturedate(String manufacturedate)
    {
        this.manufacturedate = manufacturedate == null ? null : manufacturedate.trim();
    }

    public String getDescrib()
    {
        return describ;
    }

    public void setDescrib(String describ)
    {
        this.describ = describ == null ? null : describ.trim();
    }

    @Override
    public String toString()
    {
        return "Cars{" + "carCode='" + carCode + '\'' + ", enName='" + enName + '\'' + ", zhName='" + zhName + '\'' + ", weight=" + weight + ", power=" + power + ", enginetype='" + enginetype + '\'' + ", enginedisplacement=" + enginedisplacement + ", maxspeed=" + maxspeed + ", accelerate=" + accelerate + ", price=" + price + ", carlevel='" + carlevel + '\'' + ", designer='" + designer + '\'' + ", tuner='" + tuner + '\'' + ", manufacturedate='" + manufacturedate + '\'' + ", describ='" + describ + '\'' + ", manufacturers=" + manufacturers + '}';
    }

    public Cars(String carCode, String enName, String zhName, BigDecimal weight, BigDecimal power, String enginetype, BigDecimal enginedisplacement, BigDecimal maxspeed, BigDecimal accelerate, BigDecimal price, String carlevel, String designer, String tuner, String manufacturedate, String describ, Manufacturers manufacturers)
    {
        this.carCode = carCode;
        this.enName = enName;
        this.zhName = zhName;
        this.weight = weight;
        this.power = power;
        this.enginetype = enginetype;
        this.enginedisplacement = enginedisplacement;
        this.maxspeed = maxspeed;
        this.accelerate = accelerate;
        this.price = price;
        this.carlevel = carlevel;
        this.designer = designer;
        this.tuner = tuner;
        this.manufacturedate = manufacturedate;
        this.describ = describ;
        this.manufacturers = manufacturers;
    }

    public Cars()
    {
    }
}