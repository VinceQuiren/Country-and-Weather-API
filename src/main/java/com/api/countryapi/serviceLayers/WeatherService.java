package com.api.countryapi.serviceLayers;

import com.api.countryapi.DataResponse.DataResponseWeathers;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }



    public DataResponseWeathers getWeathers(@RequestParam String city){

        String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+apiKey;
        DataResponseWeathers dataResponseWeathers = restTemplate.getForObject(url, DataResponseWeathers.class);
        return dataResponseWeathers != null ? dataResponseWeathers: null;
    }

}
