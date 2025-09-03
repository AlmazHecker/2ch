package com.twoch.services.impl;

import com.twoch.entities.Message;
import com.twoch.services.MessageService;
import com.twoch.storage.StorageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    private final StorageService storageService;

    public MessageServiceImpl(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public Message create(Message message) {
        return null;
    }

    @Override
    public void update(Message message) {

    }

    @Override
    public void delete(Long messageId) {

    }

    @Override
    public Message get(Long messageId) {
        return null;
    }
}
