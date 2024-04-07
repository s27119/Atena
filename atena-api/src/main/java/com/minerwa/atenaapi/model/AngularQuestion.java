package com.minerwa.atenaapi.model;


import com.minerwa.atenaapi.model.enums.OptionIndex;
import com.minerwa.atenaapi.model.enums.Topic;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Angular")
public class AngularQuestion extends Question {
    public AngularQuestion(String question, OptionIndex correctOptionIndex, List<String> options) {
        super(question, Topic.ANGULAR,correctOptionIndex, options);
    }
}
