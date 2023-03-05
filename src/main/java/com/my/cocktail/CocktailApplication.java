package com.my.cocktail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
public class CocktailApplication {

    public static void main(String[] args) {
        init();
        SpringApplication.run(CocktailApplication.class, args);
    }

    public static void init() {
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Asia/Seoul")));
    }
}
