package com.covidAPI.covidAPI.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class stats {

    private Date date;
    private  String name;
    private int casesDaily;
    private int casesCumulative;
    private int deathsDaily;
    private int deathsCumulative;
    private int firstVaccinationsDaily;
    private int firstVaccinationsCumulative;
    private int secondVaccinationsDaily;
    private int secondVaccinationsCumulative;
    private int newHospitalisations;

    public stats(){

    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCasesDaily() {
        return casesDaily;
    }

    public void setCasesDaily(int casesDaily) {
        this.casesDaily = casesDaily;
    }

    public int getCasesCumulative() {
        return casesCumulative;
    }

    public void setCasesCumulative(int casesCumulative) {
        this.casesCumulative = casesCumulative;
    }

    public int getDeathsDaily() {
        return deathsDaily;
    }

    public void setDeathsDaily(int deathsDaily) {
        this.deathsDaily = deathsDaily;
    }

    public int getDeathsCumulative() {
        return deathsCumulative;
    }

    public void setDeathsCumulative(int deathsCumulative) {
        this.deathsCumulative = deathsCumulative;
    }

    public int getFirstVaccinationsDaily() {
        return firstVaccinationsDaily;
    }

    public void setFirstVaccinationsDaily(int firstVaccinationsDaily) {
        this.firstVaccinationsDaily = firstVaccinationsDaily;
    }

    public int getFirstVaccinationsCumulative() {
        return firstVaccinationsCumulative;
    }

    public void setFirstVaccinationsCumulative(int firstVaccinationsCumulative) {
        this.firstVaccinationsCumulative = firstVaccinationsCumulative;
    }

    public int getSecondVaccinationsDaily() {
        return secondVaccinationsDaily;
    }

    public void setSecondVaccinationsDaily(int secondVaccinationsDaily) {
        this.secondVaccinationsDaily = secondVaccinationsDaily;
    }

    public int getSecondVaccinationsCumulative() {
        return secondVaccinationsCumulative;
    }

    public void setSecondVaccinationsCumulative(int secondVaccinationsCumulative) {
        this.secondVaccinationsCumulative = secondVaccinationsCumulative;
    }

    public int getNewHospitalisations() {
        return newHospitalisations;
    }

    public void setNewHospitalisations(int newHospitalisations) {
        this.newHospitalisations = newHospitalisations;
    }

    @Override
    public String toString() {
        return "service{" +
                "date=" + date +
                "name='" + name +  " casesDaily=" + casesDaily +
                "casesCumulative=" +casesCumulative + ", deathsDaily=" + deathsDaily +
                "deathsCumulative=" +deathsCumulative + ", firstVaccinationsDaily=" + firstVaccinationsDaily +
                "firstVaccinationsCumulative =" +firstVaccinationsCumulative +  ", secondVaccinationsDaily="
                + secondVaccinationsDaily +
                "secondVaccinationsCumulative=" +secondVaccinationsCumulative + ", newHospitalisations=" +
                newHospitalisations +
                '}' ;

    }

}
