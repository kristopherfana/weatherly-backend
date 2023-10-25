package com.example.weatherly.services.DailyForecast;

import com.example.weatherly.models.Weather.ForecastData;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface DailyForecastService {
    ForecastData getDailyForecast(Float lat,
                                  Float lon, int cnt) throws JsonProcessingException;
}
