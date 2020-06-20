package com.gacovid19project.Models;

public class FreeFood {
    String sno, district, phone_number;

    public FreeFood() {
    }

    public FreeFood(String sno, String district, String phone_number) {
        this.sno = sno;
        this.district = district;
        this.phone_number = phone_number;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
