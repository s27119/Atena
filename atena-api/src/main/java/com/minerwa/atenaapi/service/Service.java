package com.minerwa.atenaapi.service;


import com.minerwa.atenaapi.model.Question;
import com.minerwa.atenaapi.model.enums.Topic;
import com.minerwa.atenaapi.repository.AngularQuestionRepository;
import com.minerwa.atenaapi.repository.JavaQuestionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class Service {
    private final JavaQuestionRepository javaQuestionRepository;
    private final AngularQuestionRepository angularQuestionRepository;


    public List<? extends Question> getQuestions(Topic topicName) {
        log.info("Fetching Questions for given Topic: {}", topicName);
        return switch (topicName) {
            case JAVA -> javaQuestionRepository
                    .findAll();
            case ANGULAR -> angularQuestionRepository
                    .findAll();
        };
    }

}