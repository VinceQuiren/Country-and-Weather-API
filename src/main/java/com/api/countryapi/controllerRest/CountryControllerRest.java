package com.api.countryapi.controllerRest;

import com.api.countryapi.DTO.Countries;
import com.api.countryapi.DTO.CurrencyRate;
import com.api.countryapi.serviceLayers.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryControllerRest {
    private final CountryService countryService;

    public CountryControllerRest(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping("/country")
    public List<Countries> getCountry() {
        return countryService.getCountry();
    }

    @GetMapping("/city")
    public List<Countries> getCities(@RequestParam String country) {
        return countryService.getCities(country);
    }

    @GetMapping("/population")
    public List<Countries> getPopulation(@RequestParam String country) {
        return countryService.getPopulationForCountry(country);
    }

    @GetMapping("/capital")
    public List<Countries> getCapital(@RequestParam String country) {
        return countryService.getCapital(country);
    }

    @GetMapping("/flag")
    public List<Countries> getFlag(@RequestParam String country) {
        return countryService.getFlag(country);
    }

    @GetMapping("/currency")
    public List<Countries> getCurrency(@RequestParam String country) {
        return countryService.getCurrency(country);
    }

    @GetMapping("/currencyRate")
    public List<CurrencyRate> getCurrencyRate(@RequestParam String currencyCode) {
        return countryService.getCurrencyRate(currencyCode);
    }




}
