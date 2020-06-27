package com.rabbitmq.mapper;

import com.rabbitmq.model.MessageEntity;
import com.rabbitmq.model.dto.MessageDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    MessageEntity mapToMessageEntity(MessageDto messageDto);
}
