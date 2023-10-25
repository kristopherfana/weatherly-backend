package com.example.weatherly.models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutocompleteResponseData{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    String name;
    @JsonProperty("lat")
    public double getLat() {
        return this.lat; }
    double lat;
    @JsonProperty("lon")
    public double getLon() {
        return this.lon; }
    double lon;
    @JsonProperty("country")
    public String getCountry() {
        return this.country; }
    String country;
    @JsonProperty("state")
    public String getState() {
        return this.state; }
    String state;
}

