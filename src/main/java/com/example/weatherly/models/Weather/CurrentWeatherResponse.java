package com.example.weatherly.models.Weather;

import com.example.weatherly.models.BackgroundImg.BackgroundImg;

public class CurrentWeatherResponse {
    private CurrentWeatherData currentWeatherData;
    private BackgroundImg backgroundImg;

    public CurrentWeatherResponse(CurrentWeatherData currentWeatherData, BackgroundImg backgroundImg) {
        this.currentWeatherData = currentWeatherData;
        this.backgroundImg = backgroundImg;
    }

    public CurrentWeatherData getCurrentWeatherData() {
        return currentWeatherData;
    }

    public BackgroundImg getBackgroundImg() {
        return backgroundImg;
    }

    public void setCurrentWeatherData(CurrentWeatherData currentWeatherData) {
        this.currentWeatherData = currentWeatherData;
    }

    public void setBackgroundImg(BackgroundImg backgroundImg) {
        this.backgroundImg = backgroundImg;
    }
}
