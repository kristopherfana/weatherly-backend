package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class List{
        @JsonProperty("dt")
        public int getDt() {
            return this.dt; }

        int dt;
        @JsonProperty("main")
        public Main getMain() {
            return this.main; }

        Main main;
        @JsonProperty("weather")
        public ArrayList<Weather> getWeather() {
            return this.weather; }
        ArrayList<Weather> weather;

        @JsonProperty("pop")
        public double getPop() {
            return this.pop; }

        double pop;

        @JsonProperty("temp")
        public Temp getTemp() {
            return this.temp; }
        Temp temp;
    }

