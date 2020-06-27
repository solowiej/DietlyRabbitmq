package com.rabbitmq.service;

import com.rabbitmq.RabbitmqApplication;
import com.rabbitmq.model.dto.MessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    private static final Logger log = LoggerFactory.getLogger(MessageSender.class);

    private final RabbitTemplate rabbitTemplate;

    public MessageSender(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public MessageDto sendMessage(MessageDto dto) {
        rabbitTemplate.convertAndSend(RabbitmqApplication.EXCHANGE_NAME, RabbitmqApplication.ROUTING_KEY, dto);
        log.info("Message sent");
        return dto;
    }
}
