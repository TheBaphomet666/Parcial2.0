package com.parcial.Services.WeatherServiceImp;

import com.parcial.Connector.Connector;
import com.parcial.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherServiceImp implements WeatherService {
    @Autowired
    Connector con;


    @Override
    public StringBuffer Consult(String city) {
        StringBuffer response=null;
        try {
            response=con.getWeatherByCity(city);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}