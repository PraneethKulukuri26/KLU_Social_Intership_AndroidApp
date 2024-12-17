package com.praneeth.works.projects.socialinternship.Forms.Entity;

public class ReportDetails {

    private HouseServeyEntity houseServeyEntity;
    private String name;
    private String status;
    private String date;

    public HouseServeyEntity getHouseServeyEntity() {
        return houseServeyEntity;
    }

    public void setHouseServeyEntity(HouseServeyEntity houseServeyEntity) {
        this.houseServeyEntity = houseServeyEntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
