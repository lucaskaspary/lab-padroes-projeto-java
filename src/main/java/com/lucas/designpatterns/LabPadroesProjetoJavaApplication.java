package com.lucas.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class LabPadroesProjetoJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabPadroesProjetoJavaApplication.class, args);
    }

}
