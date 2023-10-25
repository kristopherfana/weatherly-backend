package com.example.weatherly.services.BackgroundImg;

import com.example.weatherly.models.BackgroundImg.BackgroundImg;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface BackgroundImgService {
    BackgroundImg getBackgroundImg(String main) throws JsonProcessingException;
}
