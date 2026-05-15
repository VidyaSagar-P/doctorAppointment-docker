package com.example.DoctorAppointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.DoctorAppointment.config.AppCorsProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class HospitalAppointmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalAppointmentApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer(AppCorsProperties corsProps) {

    return new WebMvcConfigurer() {

        @Override
        public void addCorsMappings(CorsRegistry registry) {

            registry.addMapping("/**")
                    .allowedOriginPatterns("*")
                    .allowedMethods("*")
                    .allowedHeaders("*")
                    .allowCredentials(false);
        }
    };
}
}