/*
package com.example.lab4;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.lab4.MainActivity.mainActivityapplicationContext;
import static com.example.lab4.MainActivity.orderRecyclerView;
import static com.example.lab4.MessageActivity.messageActivityApplicationContext;

import static com.example.lab4.MessageActivity.messages_recyclerView;

public class MessagesPrintOut {

    public MessagesPrintOut() {
    }

    MessageAdapter adapter;

    public void sendersName(String sendersName, MessageAttribute messageAttribute) {
        messageAttribute.setSenders_name(sendersName);
    }

    public void time(String time, MessageAttribute messageAttribute) {
        messageAttribute.setTime(time);
    }

    public void sendersText(String sendersText, MessageAttribute messageAttribute) {
        messageAttribute.setSendersText(sendersText);
    }

    public void receiverText(String receiverText, MessageAttribute messageAttribute) {
        messageAttribute.setReceiversText(receiverText);
    }



    public void addToMessageList(List<MessageAttribute> messagesList, MessageAttribute messageAttribute) {

        messagesList.add(messageAttribute);
    }

    public void setAdapter(List<MessageAttribute> messagesList) {

        messages_recyclerView.setLayoutManager(new LinearLayoutManager(messageActivityApplicationContext));
        adapter = new MessageAdapter(messagesList);
        messages_recyclerView.setAdapter(adapter);
    }

}
*/
