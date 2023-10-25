package com.example.weatherly.services.BackgroundImg;

import com.example.weatherly.models.BackgroundImg.BackgroundImg;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BackgroundImgServiceImpl implements BackgroundImgService {
    @Override
    public BackgroundImg getBackgroundImg(String description) throws JsonProcessingException {
        String apiKey="ReiS6oUAYnG6C0sC4SG_bNWkSmnXxk0sy5d7uhtPTkY";
        String url = "https://api.unsplash" +
                ".com/photos/random?orientation=landscape&query" +
                "="+description+"&client_id="+apiKey;
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper =new ObjectMapper();
        String json = restTemplate.getForObject(url, String.class);
        return objectMapper.readValue(json, BackgroundImg.class);
    }
}
