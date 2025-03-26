package com.api.countryapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Countries {

    private String iso2;
    private String iso3;
    private String country;
    private String code;
    private String name;
    private String capital;
    private String flag;
    private String currency;

    private List<City> cities;
    private List<PopulationCounts> populationCounts;




}
