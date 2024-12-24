package com.praneeth.works.projects.socialinternship.Forms.Entity;

public class ReportVillageDetails {

    private String Name;
    private VillageSurveyEntity villageSurveyEntity;
    private String date;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public VillageSurveyEntity getVillageSurveyEntity() {
        return villageSurveyEntity;
    }

    public void setVillageSurveyEntity(VillageSurveyEntity villageSurveyEntity) {
        this.villageSurveyEntity = villageSurveyEntity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
