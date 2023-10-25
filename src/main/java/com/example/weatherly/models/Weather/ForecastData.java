package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData {
    @JsonProperty("cnt")
    public int getCnt() {
        return this.cnt; }

    int cnt;

    @JsonProperty("cod")
    public String getCod() {
        return this.cod; }

    String cod;

    @JsonProperty("list")
    public ArrayList<List> getList() {
        return this.list; }

    ArrayList<List> list;

    @JsonProperty("city")
    public City getCity() {
        return this.city; }

    City city;
}
