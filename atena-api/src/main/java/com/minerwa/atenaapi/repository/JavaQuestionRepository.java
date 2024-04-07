package com.minerwa.atenaapi.repository;


import com.minerwa.atenaapi.model.JavaQuestion;
import com.minerwa.atenaapi.model.enums.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JavaQuestionRepository extends MongoRepository<JavaQuestion, String> {
    JavaQuestion findByTopic(Topic topic);

}
