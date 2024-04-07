package com.minerwa.atenaapi.model;

import com.minerwa.atenaapi.model.enums.OptionIndex;
import com.minerwa.atenaapi.model.enums.Topic;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Java")
public class JavaQuestion extends Question {

    public JavaQuestion(String question, OptionIndex correctOptionIndex, List<String> options) {
        super(question, Topic.JAVA ,correctOptionIndex, options);
    }
}