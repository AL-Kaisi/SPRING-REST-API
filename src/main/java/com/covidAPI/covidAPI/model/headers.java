package com.covidAPI.covidAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class headers {
    private int length;
    private int maxPageLimit;
    private int totalRecords;
    private stats Stats;

    public headers(){

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getMaxPageLimit() {
        return maxPageLimit;
    }

    public void setMaxPageLimit(int maxPageLimit) {
        this.maxPageLimit = maxPageLimit;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public stats getStats() {
        return Stats;
    }

    public void setStats(stats stats) {
        Stats = stats;
    }

    @Override
    public String toString() {
        return "JSONheaders{" +
                "length= " +length +  ", maxPageLimit=" + maxPageLimit +
                "totalRecords='" +totalRecords + ", Service=" + Stats + '}' ;
    }
}
