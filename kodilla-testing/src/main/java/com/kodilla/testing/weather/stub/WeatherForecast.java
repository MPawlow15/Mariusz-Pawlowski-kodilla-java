package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }

        return resultMap;
    }

    public double averageTemperature(){
        double sum = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum = temperature.getValue() + sum;
        }

        double average = sum / calculateForecast().size();

        return average;
    }

    public double medianTemperature(){
        double median = 0;
        double average = 0.0;
        int i = 0;

        double[] tab = new double[calculateForecast().size()];

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            tab[i] = temperature.getValue();
            i++;
        }

        Arrays.sort(tab);

        if (tab.length % 2 == 0 )
        {
            average = tab[tab.length/2] + tab[(tab.length/2)-1];
            median = average/2.0;
        } else {
            median = tab[tab.length/2];
        }

        return median;
    }
}