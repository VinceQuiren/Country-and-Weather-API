package com.api.countryapi.DataResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataResponseCurrencyRate {
    private String success;
    private String timestamp;
    private String base;
    private String date;
    private Map<String, Double> rates;
}
