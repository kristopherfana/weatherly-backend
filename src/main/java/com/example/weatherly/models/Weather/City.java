package com.example.weatherly.models.Weather;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City{
        @JsonProperty("name")
        public String getName() {
            return this.name; }

        String name;
        @JsonProperty("coord")
        public Coord getCoord() {
            return this.coord; }
        Coord coord;
        @JsonProperty("country")
        public String getCountry() {
            return this.country; }

        String country;

    }
