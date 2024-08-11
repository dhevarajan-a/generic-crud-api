package com.generic.crud;

import com.generic.crud.repository.BaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class CrudApplication {

//    @Bean
//    @Primary
//    public BaseRepository getDefaultOpenCrudApiRepository() {
//        return null;
//    }

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

}
