package com.example.sarsCov2App.models;

public class LocationStats {

    private String state;
    private String country;
    private Integer latestTotalCases;
    private Integer diffFromPrevDay;

    public String getCountry() {return country; }
    public Integer getLatestTotalCases() {return latestTotalCases;}
    public String getState() {return state;}
    public Integer getDiffFromPrevDay() {return diffFromPrevDay;}

    public void setCountry(String country) {this.country = country;}
    public void setLatestTotalCases(Integer latestTotalCases) {
        this.latestTotalCases = latestTotalCases;}
    public void setState(String state) {this.state = state;}
    public void setDiffFromPrevDay(Integer diffFromPrevDay) {this.diffFromPrevDay = diffFromPrevDay;}

    @Override
    public String toString() {
        return state + " " + country + " " + latestTotalCases;
    }
}
