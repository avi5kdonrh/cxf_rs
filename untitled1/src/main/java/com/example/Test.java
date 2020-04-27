package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.Exchange;

public class Test {
    public static void main(String[] args) throws Exception{
        User user = new User(1,"admin");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(System.out,user);
    }
}
