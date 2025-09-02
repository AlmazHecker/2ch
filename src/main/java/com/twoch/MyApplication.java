package com.twoch;

import com.twoch.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(StorageProperties.class)
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(MyApplication.class);
        app.setAllowBeanDefinitionOverriding(false);
        app.run(args);
    }

}