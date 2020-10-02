package com.jaswalrajat.chatbot.api;

import com.jaswalrajat.chatbot.model.Message;

public interface ChatBotAPI {
    Message getSuggestion(String message);
}
