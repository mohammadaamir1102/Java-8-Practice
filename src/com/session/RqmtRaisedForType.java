package com.session;

import java.util.*;
import java.util.stream.Collectors;

public enum RqmtRaisedForType {
    DOCUMENT,
    TELECALLING,
    PAYMENT,
    CONSENT,
    TeleVideo,
    Tele,
    Video,
    Medical,
    RCU,
    Financial,
    REMINDER_LETTER,
    Manual_Medical,
    Manual_Tele_FMR,
    Manual_Video_FMR;

    public static List<String> getValuesAsString(){
        return Arrays.stream(values())
                .map(RqmtRaisedForType :: name)
                .collect(Collectors.toList());
    }

    public static List<String> getDisplayValuesAsString(){
        return Arrays.stream(values())
                .filter(item -> !item.equals(PAYMENT))
                .filter(item -> !item.equals(CONSENT))
                .filter(item -> !item.equals(REMINDER_LETTER))
                .map(RqmtRaisedForType :: name)
                .collect(Collectors.toList());
    }
}
