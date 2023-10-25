package com.example.weatherly.models.BackgroundImg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Urls {
    @JsonProperty("raw")
    public String getRaw() {
        return this.raw; }
    String raw;
}
