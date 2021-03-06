package com.parcial.Controller;


import com.parcial.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/Weather")
public class WeatherController {

    @Autowired
    WeatherService ws;

    /* @PostMapping()
     public void postData(@RequestBody Todo todo){

     }

 */
    @RequestMapping(method = RequestMethod.GET, path = "/{City}")
    public StringBuffer getStockExchange(@PathVariable("City") String city){
        return ws.Consult(city);
    }

}
