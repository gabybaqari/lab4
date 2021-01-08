package com.example.lab4;

import java.io.Serializable;

public class MessageAttribute implements Serializable {

    private String senders_name, sendersText;

    private String time;



    public String getSenders_name() {
        return senders_name;
    }

    public void setSenders_name(String senders_name) {
        this.senders_name = senders_name;
    }

    public String getSendersText() {
        return sendersText;
    }

    public void setSendersText(String sendersText) {
        this.sendersText = sendersText;
    }



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
