package com.twoch.services;

import com.twoch.entities.Message;
import com.twoch.entities.Thread;
import java.util.List;

public interface ThreadService {

    public Thread create(Thread thread);

    public void delete(Long threadId);

    public List<Message> getMessages(Long threadId);

    public void addMessage(Long threadId, Message message);

}