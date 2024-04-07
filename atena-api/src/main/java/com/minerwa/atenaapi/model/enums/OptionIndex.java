package com.minerwa.atenaapi.model.enums;

import lombok.Getter;

@Getter
public enum OptionIndex {
    OPTION_0(0),
    OPTION_1(1),
    OPTION_2(2),
    OPTION_3(3);

    private final int value;

    OptionIndex(int value) {
        this.value = value;
    }

}