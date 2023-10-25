package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeatherData {
    @JsonProperty("coord")
    public Coord getCoord() {
        return this.coord;
    }

    Coord coord;

    @JsonProperty("weather")
    public ArrayList<Weather> getWeather() {
        return this.weather;
    }

    ArrayList<Weather> weather;
    @JsonProperty("main")
    public Main getMain() {
        return this.main;
    }

    Main main;

    @JsonProperty("dt")
    public int getDt() {
        return this.dt;
    }

    int dt;

    @JsonProperty("sys")
    public Sys getSys() {
        return this.sys;
    }

    Sys sys;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    String name;

    @JsonProperty("cod")
    public int getCod() {
        return this.cod;
    }

    int cod;

    @JsonProperty("cnt")
    public int getCnt() {
        return this.cnt; }

    int cnt;

}
