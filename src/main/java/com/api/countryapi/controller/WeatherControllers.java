package com.api.countryapi.controller;

import com.api.countryapi.DataResponse.DataResponseWeathers;
import com.api.countryapi.controllerRest.WeatherControllerRest;
import com.api.countryapi.weatherDTO.Main;
import com.api.countryapi.weatherDTO.Systems;
import com.api.countryapi.weatherDTO.Weather;
import com.api.countryapi.weatherDTO.Wind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WeatherControllers {
    @Autowired
    WeatherControllerRest weatherControllerRest;
    @GetMapping("/showFormForCityWeather")
    public String getMainWeather(@RequestParam("city")String city, Model model) {

        DataResponseWeathers dataResponseWeathers =  weatherControllerRest.getWeathers(city);

       Systems systems =  dataResponseWeathers.getSys();
       List<Weather> weather = dataResponseWeathers.getWeather();
        Main main = dataResponseWeathers.getMain();
        Wind wind = dataResponseWeathers.getWind();


        model.addAttribute("city", city);
        model.addAttribute("cityWeatherSystems", systems);
        model.addAttribute("cityWeathers", weather);
        model.addAttribute("cityWeathersWind", wind);
        model.addAttribute("cityWeatherMain", main);

        return "weathers";
    }
}
