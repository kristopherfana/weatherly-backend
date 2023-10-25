package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {
    @JsonProperty("lon")
    public double getLon() {
        return this.lon;
    }

    double lon;

    @JsonProperty("lat")
    public double getLat() {
        return this.lat;
    }

    double lat;
}
