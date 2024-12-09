package com.tk.reactive_java.controller;

import com.tk.reactive_java.service.OpenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
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
    Mono<String> chat() {
        return openAIService.chat("how to learn AWS, list only key resources");
    }


    @GetMapping("/chatStream")
    Flux<String> chatStream() {
        return openAIService.chatStream("how to learn AWS");
    }

}
