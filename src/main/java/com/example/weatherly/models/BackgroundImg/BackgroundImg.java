package com.example.weatherly.models.BackgroundImg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BackgroundImg {
    @JsonProperty("blur_hash")
    public String getBlur_hash() {
        return this.blur_hash; }
    String blur_hash;
    @JsonProperty("alt_description")
    public String getAlt_description() {
        return this.alt_description; }
    String alt_description;

    @JsonProperty("width")
    public int getWidth() {
        return this.width; }
    int width;

    @JsonProperty("height")
    public int getHeight() {
        return this.height; }
    int height;

    @JsonProperty("urls")
    public Urls getUrls() {
        return this.urls; }
    Urls urls;
}
