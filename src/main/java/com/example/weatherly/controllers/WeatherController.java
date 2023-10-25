package com.example.weatherly.controllers;

import com.example.weatherly.models.BackgroundImg.BackgroundImg;
import com.example.weatherly.models.Weather.AutocompleteResponseData;
import com.example.weatherly.models.Weather.CurrentWeatherResponse;
import com.example.weatherly.models.Weather.ForecastData;
import com.example.weatherly.services.BackgroundImg.BackgroundImgService;
import com.example.weatherly.services.CurrentWeather.CurrentWeatherService;
import com.example.weatherly.services.DailyForecast.DailyForecastService;
import com.example.weatherly.services.HourlyForecast.HourlyForecastService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WeatherController {

    private final CurrentWeatherService currentWeatherService;
    private final HourlyForecastService hourlyForecastService;
    private final DailyForecastService dailyForecastService;
    private final BackgroundImgService backgroundImgService;

    public WeatherController(CurrentWeatherService currentWeatherService, HourlyForecastService hourlyForecastService, DailyForecastService dailyForecastService1, BackgroundImgService backgroundImgService) {
        this.currentWeatherService = currentWeatherService;
        this.hourlyForecastService=hourlyForecastService;
        this.dailyForecastService = dailyForecastService1;
        this.backgroundImgService = backgroundImgService;
    }
    @GetMapping("current-weather")
    public CurrentWeatherResponse getCurrentWeather(@RequestParam("lat") float lat, @RequestParam("lon") float lon) throws JsonProcessingException {
       return currentWeatherService.getCurrentWeather(lat, lon);
    }

    @GetMapping("daily-forecast")
    public ForecastData getDailyForecast() throws JsonProcessingException {
        return dailyForecastService.getDailyForecast(-40.15018F,
                -72.69616F, 4);
    }

    @GetMapping("hourly-forecast")
    public ForecastData getHourlyForecast(@RequestParam("lat") float lat, @RequestParam("lon") float lon) throws JsonProcessingException {
        return hourlyForecastService.getHourlyForecast(lat, lon);
    }

    @GetMapping("autocomplete/{city}")
    public AutocompleteResponseData[] getListOfCities(@PathVariable String city) throws JsonProcessingException {
        String url="https://api.openweathermap.org/geo/1" +
                ".0/direct?q="+city+",&limit=10&appid" +
                "=ca8c6ec76045f8382dcf193fd7b48718";
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = restTemplate.getForObject(url, String.class);
        return objectMapper.readValue(json,
                AutocompleteResponseData[].class);
    }
    @GetMapping("background-img/{description}")
    public BackgroundImg getBackgroundImg(@PathVariable String description) throws JsonProcessingException {
        return backgroundImgService.getBackgroundImg(description);
    }
}
