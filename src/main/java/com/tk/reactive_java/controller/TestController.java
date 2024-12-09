package com.tk.reactive_java.controller;

import com.tk.reactive_java.OpenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    private final OpenAIService openAIService;

    public TestController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @GetMapping
    Mono<String> test() {
        return Mono.just("Test!!");
    }

    @GetMapping("/chat")
    Mono<String> chat(@RequestParam String query) {
        return openAIService.chat("how to learn AWS");
    }

}
