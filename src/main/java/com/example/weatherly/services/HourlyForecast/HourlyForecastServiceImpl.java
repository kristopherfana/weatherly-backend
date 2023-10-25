package com.example.weatherly.services.HourlyForecast;

import com.example.weatherly.models.Weather.ForecastData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HourlyForecastServiceImpl implements HourlyForecastService{

    @Override
    public ForecastData getHourlyForecast(Float lat,
                                          Float lon) throws JsonProcessingException {
        String apiKey="ca8c6ec76045f8382dcf193fd7b48718";
        String url = "https://pro.openweathermap.org/data/2.5/forecast/hourly?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey
                + "&units=metric&cnt=8";
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper =new ObjectMapper();

        String json = restTemplate.getForObject(url, String.class);
        return objectMapper.readValue(json, ForecastData.class);
    }
}
