package com.rabbitmq.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDto {
    private final String text;
    private final String topic;
    private final String receiver;

    public MessageDto(@JsonProperty("text") final String text,
                      @JsonProperty("topic") final String topic,
                      @JsonProperty("receiver") final String receiver) {
        this.text = text;
        this.topic = topic;
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public String getTopic() {
        return topic;
    }

    public String getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "text='" + text + '\'' +
                ", topic='" + topic + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
