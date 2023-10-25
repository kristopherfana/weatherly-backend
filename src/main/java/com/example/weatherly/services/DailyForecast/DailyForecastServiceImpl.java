package com.example.weatherly.services.DailyForecast;

import com.example.weatherly.models.Weather.ForecastData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DailyForecastServiceImpl implements DailyForecastService{

    @Override
    public ForecastData getDailyForecast(Float lat,
                                         Float lon, int cnt) throws JsonProcessingException {
        String apiKey="ca8c6ec76045f8382dcf193fd7b48718";
        String url = "https://pro.openweathermap.org/data/2" +
                ".5/forecast/daily?lat=" + lat + "&lon=" + lon +
                "&appid=" + apiKey
                + "&units=metric&cnt=" +cnt;
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper =new ObjectMapper();

        String json = restTemplate.getForObject(url, String.class);
        return objectMapper.readValue(json, ForecastData.class);
    }
}
