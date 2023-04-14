package com.example.bike;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class BikeConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(BikeRepository repository){
        return args -> {
            Bike Honda = new Bike(1,
                    "Honda",
                    "CBR",
                    2022,
                    200,
                    35.0

            );

            Bike Yamaha = new Bike(2,
                    "Yamaha",
                    "R1",
                    2021,
                    195,
                    30.0

            );

            Bike Kawasaki = new Bike(3,
                    "Kawasaki",
                    "Ninja",
                    2023,
                    205,
                    32.0
            );

            repository.saveAll(List.of(Honda, Yamaha, Kawasaki));

        };
    }

    }

