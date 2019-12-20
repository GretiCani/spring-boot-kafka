package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class Controller {

    private final Producer producer;

    @Autowired
    public Controller(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/publish/{message}")
    public void sendMessage(@PathVariable String message){
        this.producer.sendMessage(message);
    }


}
