package com.example.weatherly.services.HourlyForecast;

import com.example.weatherly.models.Weather.ForecastData;
import com.fasterxml.jackson.core.JsonProcessingException;


public interface HourlyForecastService {
    ForecastData getHourlyForecast(Float lat, Float lon) throws JsonProcessingException;
}
