    package com.api.countryapi.DataResponse;

    import com.api.countryapi.weatherDTO.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import java.util.List;
    import java.util.Map;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class DataResponseWeathers {
        private Coordination coord;
        private List<Weather> weather;
        private String base;
        private Main main;
        private String visibility;
        private Wind wind;
        private Map<String, Double> rain;
        private Clouds clouds;
        private String dt;
        private Systems sys;
        private String timezone;
        private String id;
        private String name;
        private String cod;




    }
