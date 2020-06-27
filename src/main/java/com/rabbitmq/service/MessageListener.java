package com.rabbitmq.service;

import com.rabbitmq.RabbitmqApplication;
import com.rabbitmq.model.dto.MessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    private MessageEntityService messageEntityService;

    @Autowired
    public MessageListener(MessageEntityService messageEntityService) {
        this.messageEntityService = messageEntityService;
    }

    @RabbitListener(queues = RabbitmqApplication.QUEUE)
    public void consumeMessage(final Message message) {
        log.info("Received message, is: {}", message.toString());

        Object payload = message.getPayload();
        if (payload instanceof MessageDto) {
            messageEntityService.save((MessageDto) payload);
        }
    }
}
