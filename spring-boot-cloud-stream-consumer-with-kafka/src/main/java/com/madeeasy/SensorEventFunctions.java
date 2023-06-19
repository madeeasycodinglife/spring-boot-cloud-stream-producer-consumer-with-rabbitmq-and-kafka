package com.madeeasy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class SensorEventFunctions {
    // create a consumer
    @Bean
    public Consumer<String> logEventReceived() {
        return sensorEventMessage -> log.info("Message received: {}", sensorEventMessage);
    }
}
