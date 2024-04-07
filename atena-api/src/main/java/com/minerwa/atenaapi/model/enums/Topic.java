package com.minerwa.atenaapi.model.enums;


import lombok.Getter;

@Getter
public enum Topic {
    JAVA("Java"),
    ANGULAR("Angular");
    private final String value;

    Topic(String value) {
        this.value = value;
    }

}
