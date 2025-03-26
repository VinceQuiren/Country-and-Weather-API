package com.api.countryapi.controller;

import com.api.countryapi.controllerRest.CountryControllerRest;
import com.api.countryapi.DTO.Countries;
import com.api.countryapi.DTO.CurrencyRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CountriesControllers {
@Autowired
private CountryControllerRest countryController;
    @GetMapping("/countries")
    public String getCountries(Model model){
        List<Countries> countries = countryController.getCountry();

        model.addAttribute("countries", countries);
        return "country";
    }
    @GetMapping("/showFormForCountry")
    public String getCity(@RequestParam("country") String country, Model model){
        List<Countries> populations = countryController.getPopulation(country);
        List<Countries> capitals = countryController.getCapital(country);
        List<Countries> flag = countryController.getFlag(country);
        List<Countries> currency = countryController.getCurrency(country);

//        String currencyCode = currency.get(0).getCurrency();

//        List<CurrencyRate> currencyRate = countryController.getCurrencyRate(currencyCode);

         List<Countries> cities =  countryController.getCities(country);


        model.addAttribute("country", country);
        model.addAttribute("city", cities);
        model.addAttribute("population", populations);
        model.addAttribute("capital", capitals);
        model.addAttribute("flag", flag);
        model.addAttribute("currency", currency);
//        model.addAttribute("currencyRate", currencyRate);

        // send over to our form
        return "city";
    }



    

}
