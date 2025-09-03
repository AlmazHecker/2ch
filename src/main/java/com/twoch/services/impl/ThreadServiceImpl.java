package com.twoch.services.impl;

import com.twoch.entities.Message;
import com.twoch.entities.Thread;
import com.twoch.services.ThreadService;
import com.twoch.storage.StorageService;

import java.util.List;

public class ThreadServiceImpl implements ThreadService {

    StorageService storageService;

    public ThreadServiceImpl(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public Thread create(Thread thread) {
        storageService.store(thread.getCode());
        return null;
    }

    @Override
    public void delete(Long threadId) {

    }

    @Override
    public List<Message> getMessages(Long threadId) {
        return List.of();
    }

    @Override
    public void addMessage(Long threadId, Message message) {

    }
}
