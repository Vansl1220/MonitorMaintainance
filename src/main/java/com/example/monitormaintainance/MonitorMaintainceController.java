package com.example.monitormaintainance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorMaintainceController {
    public String defaultMessage="Message: Everything op";

    public String message = defaultMessage;

    @RequestMapping("/")
    public String defaultwebseite (){
        return message;
    }
}
