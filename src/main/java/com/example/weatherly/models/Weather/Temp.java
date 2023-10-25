package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temp {
    @JsonProperty("day")
    public double getDay() {
        return this.day; }
    double day;
    @JsonProperty("min")
    public double getMin() {
        return this.min; }
    public void setMin(double min) {
        this.min = min; }
    double min;
    @JsonProperty("max")
    public double getMax() {
        return this.max; }
    double max;
}
