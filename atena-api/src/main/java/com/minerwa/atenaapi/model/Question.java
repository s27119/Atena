package com.minerwa.atenaapi.model;


import com.minerwa.atenaapi.model.enums.OptionIndex;
import com.minerwa.atenaapi.model.enums.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@RequiredArgsConstructor
@Data
public abstract class Question {
    @Id
    private String id;
    private String question;
    private Topic topic;
    private OptionIndex correctOptionIndex;
    private List<String> options;
    public Question(String question,Topic topic, OptionIndex optionIndex, List<String> options) {
        this.question = question;
        this.correctOptionIndex = optionIndex;
        this.options = options;
        this.topic = topic;
    }

}
