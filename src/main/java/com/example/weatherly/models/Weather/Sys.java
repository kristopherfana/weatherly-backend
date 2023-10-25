package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
    @JsonProperty("country")
    public String getCountry() {
        return this.country;
    }

    String country;
}
