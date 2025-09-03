package com.twoch.services.impl;

import com.twoch.dto.response.MessagePaginatedResponse;
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
        storageService.store(thread.getCode(), thread.getDescription());
        return thread;
    }

    @Override
    public void delete(String threadCode) {
        storageService.delete(threadCode);
    }

    @Override
    public MessagePaginatedResponse getMessages(String threadCode) {
        return List.of();
    }

    @Override
    public void addMessage(String threadCode, Message message) {

    }
}
