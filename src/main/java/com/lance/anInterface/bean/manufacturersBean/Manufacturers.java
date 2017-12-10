package com.lance.anInterface.bean.manufacturersBean;

import com.lance.anInterface.bean.carsBean.Cars;

public class Manufacturers {
    private String ocde;

    private String racinglevel;

    private String nameEn;

    private String nameZh;

    private String country;

    private String describ;

    private String logo;

    private Cars cars;

    public Cars getCars()
    {
        return cars;
    }

    public void setCars(Cars cars)
    {
        this.cars = cars;
    }

    public String getOcde() {
        return ocde;
    }

    public void setOcde(String ocde) {
        this.ocde = ocde == null ? null : ocde.trim();
    }

    public String getRacinglevel() {
        return racinglevel;
    }

    public void setRacinglevel(String racinglevel) {
        this.racinglevel = racinglevel == null ? null : racinglevel.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh == null ? null : nameZh.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ == null ? null : describ.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Manufacturers(String ocde, String racinglevel, String nameEn, String nameZh, String country, String describ, String logo, Cars cars)
    {
        this.ocde = ocde;
        this.racinglevel = racinglevel;
        this.nameEn = nameEn;
        this.nameZh = nameZh;
        this.country = country;
        this.describ = describ;
        this.logo = logo;
        this.cars = cars;
    }

    public Manufacturers()
    {
    }
}