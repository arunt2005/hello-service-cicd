package com.apps.service;

import com.apps.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class HelloService {


    @Autowired
    private HelloDao helloDao;

    public String getService() {
        String msg = "hello service. welcome. - " + LocalDateTime.now().format(DateTimeFormatter
                .ofPattern("dd-MMMM-yyyy, hh:mm:ss:SSS a")) + "\n\n" + helloDao.getData();

        System.out.println("<<<<<   " + helloDao.getData() + "   >>>>>");

        return msg;
    }

}
