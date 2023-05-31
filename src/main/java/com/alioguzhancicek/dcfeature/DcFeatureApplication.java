package com.alioguzhancicek.dcfeature;

import com.alioguzhancicek.dcfeature.model.Student;
import com.alioguzhancicek.dcfeature.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DcFeatureApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcFeatureApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> studentRepository.save(new Student(null, "john doe", "johndoe@johndoe.com"));
    }


}
