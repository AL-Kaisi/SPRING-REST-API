package com.covidAPI.covidAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Headers {
    private int length;
    private int maxPageLimit;
    private int totalRecords;
    private List<stats> data;

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

    public List<stats> getData() {
        return data;
    }

    public void setData(List<stats> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JSONheaders{" +
                "length= " +length +  ", maxPageLimit=" + maxPageLimit +
                "totalRecords='" +totalRecords + ", Service=" + data + '}' ;
    }
}
