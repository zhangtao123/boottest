package com.example.boottest.util;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T toObject(String json, Class<T> valueType) throws Exception {
        T result;
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        result = objectMapper.readValue(json, valueType);
        return result;
    }

    public static String toJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> toList(String json, Class<T> valueType) {
        T result = null;
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            CollectionType type = objectMapper.getTypeFactory().constructCollectionType(List.class, valueType);
            result = objectMapper.readValue(json, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (List<T>) result;
    }

    public static <T> String serialize(T object) {
        return JSON.toJSONString(object);
    }
}