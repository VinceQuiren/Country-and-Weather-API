package com.api.countryapi.serviceLayers;


import com.api.countryapi.DataResponse.DataResponseCountry;
import com.api.countryapi.DataResponse.DataResponseCurrencyRate;
import com.api.countryapi.DTO.Countries;
import com.api.countryapi.DTO.CurrencyRate;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    private final RestTemplate restTemplate;

    public CountryService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    ObjectMapper objectMapper = new ObjectMapper();
    public List<Countries> getCountry(){

        String url = "https://countriesnow.space/api/v0.1/countries";

        DataResponseCountry response = restTemplate.getForObject(url, DataResponseCountry.class);
        return response != null ? response.getData() : List.of();
    }

    public List<Countries> getCities( String country){

        return getCountry().stream()
                .filter(city->city.getCountry().equals(country))
                .collect(Collectors.toList());



    }
    public List<Countries> getPopulationForCountry( String country){

        String url = "https://countriesnow.space/api/v0.1/countries/population";
        DataResponseCountry response = restTemplate.getForObject(url, DataResponseCountry.class);
        return response != null ? response.getData().stream()
                .filter(p -> p.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList()) : List.of();
    }


    public List<Countries> getCapital( String country){

        String url = "https://countriesnow.space/api/v0.1/countries/capital";

        DataResponseCountry response = restTemplate.getForObject(url, DataResponseCountry.class);
        return response != null ? response.getData().stream()
                .filter(c -> c.getName().equalsIgnoreCase(country))
                .collect(Collectors.toList()) : List.of();
    }

    public List<Countries> getFlag( String country){
        RestTemplate template = new RestTemplate();
        String url = "https://countriesnow.space/api/v0.1/countries/flag/images";
        DataResponseCountry response = restTemplate.getForObject(url, DataResponseCountry.class);
        return response != null ? response.getData().stream()
                .filter(c -> c.getName().equalsIgnoreCase(country))
                .collect(Collectors.toList()) : List.of();
    }

    public List<Countries> getCurrency( String country){
        RestTemplate template = new RestTemplate();
        String url = "https://countriesnow.space/api/v0.1/countries/currency";
        DataResponseCountry response = restTemplate.getForObject(url, DataResponseCountry.class);
        return response != null ? response.getData().stream()
                .filter(c -> c.getName().equalsIgnoreCase(country))
                .collect(Collectors.toList()) : List.of();
    }



        public List<CurrencyRate> getCurrencyRate(String currencies){

        String url = "http://api.exchangeratesapi.io/v1/latest?access_key=92d6d017c1ece8c8e4f7fd53ecbfda2b";



        DataResponseCurrencyRate response = restTemplate.getForObject(url, DataResponseCurrencyRate.class);
        return response != null ? response.getRates().entrySet().stream()
                .map(entry -> new CurrencyRate(entry.getKey(), entry.getValue()))
                .filter(rate -> rate.getCurrency().equalsIgnoreCase(currencies))
                .collect(Collectors.toList()) : List.of();
    }


}
