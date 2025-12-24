package com.apps.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class HelloService {

    public String getService() {
        String msg = "hello service. welcome. - " + LocalDateTime.now().format(DateTimeFormatter
                .ofPattern("dd-MMMM-yyyy, hh:mm:ss:SSS a"));

        System.out.println("<<<<<   " + msg + "   >>>>>");

        return "hello service. welcome. - " + LocalDateTime.now().format(DateTimeFormatter
                .ofPattern("dd-MMMM-yyyy, hh:mm:ss:SSS a"));
    }

}
