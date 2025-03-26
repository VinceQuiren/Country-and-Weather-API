package com.api.countryapi.DataResponse;

import com.api.countryapi.DTO.Countries;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataResponseCountry {

    private boolean error;
    private String msg;
    private List<Countries> data;

}
