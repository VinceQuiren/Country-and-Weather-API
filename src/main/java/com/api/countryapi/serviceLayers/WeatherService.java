package com.api.countryapi.serviceLayers;

import com.api.countryapi.DataResponse.DataResponseWeathers;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }



    public DataResponseWeathers getWeathers(@RequestParam String city){

        String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+"0f48147f9d993aae1b6e2a208d27b730";
        DataResponseWeathers dataResponseWeathers = restTemplate.getForObject(url, DataResponseWeathers.class);
        return dataResponseWeathers != null ? dataResponseWeathers: null;
    }

}
