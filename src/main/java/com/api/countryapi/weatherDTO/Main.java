package com.api.countryapi.weatherDTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Main {

    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private double pressure;
    private double humidity;
    private double sea_level;
    private double grnd_level;

    public String getTemp() {
        return String.format("%.2f", temp);
    }

    public void setTemp(double temp) {
        this.temp = temp -273.15;
    }

    public String getFeels_like() {
        return String.format("%.2f", feels_like);
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like - 273.15;
    }

    public String getTemp_min() {
        return String.format("%.2f", temp_min);
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min - 273.15;
    }

    public String getTemp_max() {
        return String.format("%.2f", temp_max);
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max - 273.15;
    }

    public String getPressure() {
        return String.format("%.2f", pressure);
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return String.format("%.2f", humidity);
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getSea_level() {
        return String.format("%.2f", temp);
    }

    public void setSea_level(double sea_level) {
        this.sea_level = sea_level;
    }

    public String getGrnd_level() {
        return String.format("%.2f", grnd_level);
    }

    public void setGrnd_level(double grnd_level) {
        this.grnd_level = grnd_level;
    }


}
