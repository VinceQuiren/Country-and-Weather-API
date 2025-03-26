package com.api.countryapi.controllerRest;

import com.api.countryapi.DataResponse.DataResponseWeathers;
import com.api.countryapi.serviceLayers.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
public class WeatherControllerRest {

    @Autowired
    private WeatherService weatherService;


    @GetMapping("/weathers")
    public DataResponseWeathers getWeathers(@RequestParam String city){



        return weatherService.getWeathers(city);
    }


}
