package one.digitalinnovation.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Hello
{
    @GetMapping
    public static String helloMessage(String[] args) {
        return String.format("Hello to Digital Innovation One!");
    }
}