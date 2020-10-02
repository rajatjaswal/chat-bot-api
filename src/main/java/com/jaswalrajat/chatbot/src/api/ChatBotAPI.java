package com.jaswalrajat.chatbot.src.api;

import com.jaswalrajat.chatbot.src.model.Message;

public interface ChatBotAPI {
    Message getSuggestion(String message);
}
