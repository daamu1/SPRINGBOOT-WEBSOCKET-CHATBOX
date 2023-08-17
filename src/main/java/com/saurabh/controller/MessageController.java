package com.saurabh.controller;

import com.saurabh.models.Messsage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v3")
public class MessageController {
    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Messsage getMessageContant(@RequestBody Messsage messsage) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return messsage;
    }
}
