package com.api.countryapi.weatherDTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
public class Systems {
    private int type;
    private int id;
    private String country;
    private String sunrise;
    private String sunset;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        LocalDateTime sunriseDateTime = Instant.ofEpochSecond(sunrise)
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedSunrise = sunriseDateTime.format(formatter);

        this.sunrise = formattedSunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        LocalDateTime sunriseDateTime = Instant.ofEpochSecond(sunset)
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedSunrise = sunriseDateTime.format(formatter);

        this.sunset = formattedSunrise;
    }
}




