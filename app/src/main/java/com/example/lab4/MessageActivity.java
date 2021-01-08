/*
package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.lab4.MainActivity.orderRecyclerView;

public class MessageActivity extends AppCompatActivity {
    private ImageView home_icon, message_icon, archive_icon;
    static RecyclerView messages_recyclerView;
    static List<MessageAttribute> messagesList;
    static Context messageActivityApplicationContext;
    private MessageAdapter messageAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private MessageAttribute messageAttribute;
    private MessagesPrintOut messaesprintOut;
    private TextView messagesPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        home_icon=findViewById(R.id.home);
        archive_icon=findViewById(R.id.archive);
        message_icon=findViewById(R.id.messages);

        messageAttribute=new MessageAttribute();
        messagesList=new ArrayList<>();
        messaesprintOut=new MessagesPrintOut();
        messages_recyclerView=findViewById(R.id.messagesRecyclerView);
        messagesPage=findViewById(R.id.messagesPage);
        messagesPage.setText("Messages");


        hardcode();
        */
/*for(int i=0;i<4;i++){
            Log.d("list "+i, orderList.get(i).getFrom()+"");

        }*//*

        buildRecyclerView();
        home_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity();
            }
        });
        message_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStart();
            }
        });
        archive_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                archiveActivity();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        buildRecyclerView();
    }

    public void mainActivity(){
        Intent intent=new Intent(this, MainActivity.class);

        startActivity(intent);
    }
    public void archiveActivity(){
        Intent intent=new Intent(this, ArchiveActivity.class);

        startActivity(intent);
    }
    public void conversationsActivity(){
        Intent intent=new Intent(this, ConversationsActivity.class);

        startActivity(intent);
    }
    public void hardcode(){
        for(int i=0;i<8;i++){
            messageAttribute=new MessageAttribute();
            messaesprintOut.sendersName("Elias ", messageAttribute);
            messaesprintOut.time("13:0", messageAttribute);
            messaesprintOut.sendersText( "hi", messageAttribute);
            messaesprintOut.receiverText("hej", messageAttribute);
            messaesprintOut.addToMessageList(messagesList, messageAttribute);
        }
        messaesprintOut.setAdapter(messagesList);
    }
    public void buildRecyclerView() {
        messages_recyclerView = findViewById(R.id.messagesRecyclerView);
        messages_recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        messageAdapter = new MessageAdapter(messagesList);
        messages_recyclerView.setLayoutManager(mLayoutManager);
        messages_recyclerView.setAdapter(messageAdapter);
        messageAdapter.setOnItemClickListener(new MessageAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                conversationsActivity();
            }

        });
    }
}*/
