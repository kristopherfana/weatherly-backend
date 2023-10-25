package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    int id;

    @JsonProperty("main")
    public String getMain() {
        return this.main;
    }

    String main;

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    String description;

}
