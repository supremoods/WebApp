package com.example.WebApp.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student supremo = new Student(
                    1L,
                    "Supremo",
                    "lappay.john@gmail.com",
                    LocalDate.of(2001, Month.OCTOBER, 25),
                    20
            );
            Student keith = new Student(
                    2L,
                    "keith",
                    "keith.badillo@gmail.com",
                    LocalDate.of(2000, Month.NOVEMBER, 11),
                    21
            );
            repository.saveAll(List.of(supremo, keith));
        };
    
    }

}
