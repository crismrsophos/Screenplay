package com.sophossolutions.certification.utils;

public class GetType {

    public static String ofField(Object value) {
        return value.getClass().getSimpleName();
    }

    public static Object of(String value, Object target) {

        switch (ofField(target)) {

            case "Integer":
                return Integer.parseInt(String.valueOf(value));
            case "String":
                return String.valueOf(value);
            case "Boolean":
                return Boolean.parseBoolean(value);
            default:
                break;
        }
        return value;
    }

}
