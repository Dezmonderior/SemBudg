package com.example.sembudg;

import java.util.Date;

public class Message {
    public String userName,TextMessage;
    private long messageTime;

    public Message() {
    }

    public Message(String userName, String textMessage) {
        this.userName = userName;
        this.TextMessage = textMessage;
        this.messageTime = new Date().getTime();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTextMessage() {
        return TextMessage;
    }

    public void setTextMessage(String textMessage) {
        TextMessage = textMessage;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
