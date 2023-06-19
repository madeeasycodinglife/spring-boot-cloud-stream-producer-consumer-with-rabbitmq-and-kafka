package com.madeeasy.controller;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor")
public class CloudStreamController {
    private final StreamBridge streamBridge;
    private static final String SENSOR_EVENT_PRODUCER = "sensorEventProducer-out-0"; // from yml file

    public CloudStreamController(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @GetMapping
    public ResponseEntity<String> produceSensorEvent() {
        streamBridge.send(SENSOR_EVENT_PRODUCER, "hello");
        return ResponseEntity.ok("Event produced");
    }
}
