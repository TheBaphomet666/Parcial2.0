package com.parcial.Connector;

import java.io.IOException;
import java.net.URL;

public interface Connector {
    StringBuffer getWeatherByCity(String city) throws IOException;
}
