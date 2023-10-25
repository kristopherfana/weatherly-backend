package com.example.weatherly.services.CurrentWeather;

import com.example.weatherly.models.Weather.CurrentWeatherResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface CurrentWeatherService {
    CurrentWeatherResponse getCurrentWeather(Float lat
            , Float lon) throws JsonProcessingException;

}
