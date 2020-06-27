package com.rabbitmq.controller;


import com.rabbitmq.model.dto.MessageDto;
import com.rabbitmq.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(MessageController.API_PATH)
public class MessageController {
    private MessageSender messageSender;
    static final String API_PATH = "/api";

    @Autowired
    public MessageController(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @PostMapping
    public ResponseEntity sendMessage(@RequestBody MessageDto dto) {
        return ResponseEntity.ok(messageSender.sendMessage(dto));
    }
}
