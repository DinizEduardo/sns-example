package br.com.example.sns.producer.controller;

import br.com.example.sns.producer.sns.SnsExample;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private final SnsExample snsExample;

    public PostController(SnsExample snsExample) {
        this.snsExample = snsExample;
    }

    @PostMapping("/message")
    public void postMessage(@RequestBody String message) {
        snsExample.publish(message);
    }

}
