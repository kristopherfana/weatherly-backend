package com.example.weatherly.services.CurrentWeather;

import com.example.weatherly.models.BackgroundImg.BackgroundImg;
import com.example.weatherly.models.Weather.CurrentWeatherData;
import com.example.weatherly.models.Weather.CurrentWeatherResponse;
import com.example.weatherly.services.BackgroundImg.BackgroundImgService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrentWeatherServiceImpl implements CurrentWeatherService {

    private final BackgroundImgService backgroundImgService;

    public CurrentWeatherServiceImpl(BackgroundImgService backgroundImgService) {
        this.backgroundImgService = backgroundImgService;
    }

    @Override
    public CurrentWeatherResponse getCurrentWeather(Float lat,
                                                    Float lon) throws JsonProcessingException {
        String apiKey="ca8c6ec76045f8382dcf193fd7b48718";
        String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey
                + "&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper =new ObjectMapper();

        String json = restTemplate.getForObject(url, String.class);
        CurrentWeatherData currentWeatherData =
                objectMapper.readValue(json,
                        CurrentWeatherData.class);
        String description =
                currentWeatherData.getWeather().get(0).getDescription();
        BackgroundImg backgroundImg=
                this.backgroundImgService.getBackgroundImg(description);
        return new CurrentWeatherResponse(currentWeatherData,
                backgroundImg);
    }
}
