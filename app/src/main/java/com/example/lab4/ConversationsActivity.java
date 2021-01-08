package com.example.lab4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ConversationsActivity extends AppCompatActivity {


    private ImageView send_icon, mic_icon;
    private EditText editText;
    static RecyclerView conversation_recyclerView;
    static List<MessageAttribute> conversationsList;
    static Context conversationActivityApplicationContext;
    private List<String> sendersList;
    private List<String> serviceList;
    private ConversationAdapter conversationAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private MessageAttribute messageAttribute;
    private ConversationPrintOut conversationPrintOut;
    private TextView service;

    private Date currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversations);

        send_icon=findViewById(R.id.send);
        mic_icon=findViewById(R.id.mic);
        service=findViewById(R.id.service);
        editText=findViewById(R.id.editText);
        messageAttribute=new MessageAttribute();
        conversationsList=new ArrayList<>();
        sendersList=new ArrayList<>();
        serviceList=new ArrayList<>();
        conversationPrintOut=new ConversationPrintOut();
        conversation_recyclerView=findViewById(R.id.conversationsRecyclerView);



        //service.setText("Service");


        //hardcodeService("hi");
        /*for(int i=0;i<4;i++){
            Log.d("list "+i, orderList.get(i).getFrom()+"");

        }*/
        //buildRecyclerView();

        send_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mainActivity();
                Log.d("edit Text", editText.getText().toString());
                if(!editText.getText().toString().equals("")) {
                    //sendersName.setTextColor(Color.red(4));
                    Log.d("edit Text", editText.getText().toString());
                    //sendersList.add(editText.getText().toString());
                    hardcodeSender(editText.getText().toString(), "Elias");
                    //conversationAdapter.notifyDataSetChanged();
                    //editText.clearAnimation();
                    editText.setText("");

                }
            }
        });
        mic_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSpeechInput();
            }
        });

    }

    private void hardcodeService(String hi) {
    }

    @Override
    protected void onStart() {
        super.onStart();
        //buildRecyclerView();

    }


    public void hardcodeSender(String text, String name){
        currentTime = Calendar.getInstance().getTime();
        //conversationAdapter.notifyDataSetChanged();
        //for(int i=0;i<sendersList.size();i++){
            messageAttribute=new MessageAttribute();
            conversationPrintOut.sendersNameText(name, messageAttribute);
            conversationPrintOut.timeText(currentTime+"", messageAttribute);
            conversationPrintOut.sendersTextText( text, messageAttribute);

            conversationPrintOut.addToConversationList(conversationsList, messageAttribute);
        //}
        conversationPrintOut.setAdapter(conversationsList);
    }
    /*public void buildRecyclerView() {
        conversation_recyclerView = findViewById(R.id.messagesRecyclerView);
        conversation_recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        messageAdapter = new MessageAdapter(conversationsList);
        conversation_recyclerView.setLayoutManager(mLayoutManager);
        conversation_recyclerView.setAdapter(messageAdapter);
        messageAdapter.setOnItemClickListener(new MessageAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                conversationsActivity();
            }

        });
    }*/
    public void getSpeechInput() {
        //Log.d("view", view.toString());

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 10);
        } else {
            Toast.makeText(this, "Your Device Don't Support Speech Input", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 10:
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    editText.setText(result.get(0));
                }
                break;
        }
    }
}