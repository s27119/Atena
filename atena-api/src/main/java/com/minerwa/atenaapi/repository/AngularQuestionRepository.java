package com.minerwa.atenaapi.repository;


import com.minerwa.atenaapi.model.AngularQuestion;
import com.minerwa.atenaapi.model.enums.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AngularQuestionRepository extends MongoRepository<AngularQuestion, String> {
    AngularQuestion findByTopic(Topic topic);
}
