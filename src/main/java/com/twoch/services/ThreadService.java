package com.twoch.services;

import com.twoch.dto.response.MessagePaginatedResponse;
import com.twoch.entities.Message;
import com.twoch.entities.Thread;
import java.util.List;

public interface ThreadService {

    public Thread create(Thread thread);

    public void delete(String threadCode);

    public MessagePaginatedResponse getMessages(String threadCode);

    public void addMessage(String threadCode, Message message);

}