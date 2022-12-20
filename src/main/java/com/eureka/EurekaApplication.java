package com.eureka;

import com.eureka.util.RunBrowser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        String url = "http://localhost:8080/";
        RunBrowser.startBrowser(url);
    }
}
