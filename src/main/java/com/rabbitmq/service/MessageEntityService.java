package com.rabbitmq.service;

import com.rabbitmq.mapper.MessageMapper;
import com.rabbitmq.model.MessageEntity;
import com.rabbitmq.model.dto.MessageDto;
import com.rabbitmq.repository.MessageEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageEntityService {
    private MessageEntityRepository messageEntityRepository;
    private MessageMapper messageMapper;

    @Autowired
    public MessageEntityService(MessageEntityRepository messageEntityRepository, MessageMapper messageMapper) {
        this.messageEntityRepository = messageEntityRepository;
        this.messageMapper = messageMapper;
    }


    public void save(MessageDto messageDto) {
        MessageEntity messageEntity = messageMapper.mapToMessageEntity(messageDto);
        messageEntityRepository.save(messageEntity);
    }

    /**
    Crud and additional usage methods to implement
     */
}
