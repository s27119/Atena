package com.minerwa.atenaapi.controller;


import com.minerwa.atenaapi.model.enums.Topic;
import com.minerwa.atenaapi.model.response.Response;
import com.minerwa.atenaapi.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/atena")
@RequiredArgsConstructor
public class Controller {
    private final Service service;

    @GetMapping("/questions/{topic}")
    public ResponseEntity<Response> getQuestions(@PathVariable String topic) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("questions", service.getQuestions(Topic.valueOf(topic.toUpperCase()))))
                        .message("Questions with given Topic: " + topic + " retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }



//    @GetMapping("/subtopics/{topic}")
//    public ResponseEntity<Response> getSubtopics(@PathVariable String topic) {
//        return ResponseEntity.ok(
//                Response.builder()
//                        .timeStamp(now())
//                        .data(Map.of("subtopics", service.getSubtopicsForTopic(topic)))
//                        .message("Subtopics for given Topic: " + topic + " retrieved")
//                        .status(OK)
//                        .statusCode(OK.value())
//                        .build()
//        );
//    }
}
