package com.twoch.services;

import com.twoch.entities.Message;

public interface MessageService {

    public Message create(Message message);

    public void update(Message message);

    public void delete(Long messageId);

    public Message get(Long messageId);
}