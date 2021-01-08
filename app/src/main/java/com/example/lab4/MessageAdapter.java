/*
package com.example.lab4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter  extends RecyclerView.Adapter<MessageAdapter.MessagesViewHolder> {


    private List<MessageAttribute> messagesList;
    private View view;
    private OnItemClickListener mListener;
    LayoutInflater inflater;
    public MessageAdapter( List<MessageAttribute> messagesList) {
        this.messagesList = messagesList;
    }

    public interface OnItemClickListener{
        void onItemClick(int position);


    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener=  listener;
    }


    @NonNull
    @Override
    public MessageAdapter.MessagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view=LayoutInflater.from(parent.getContext()).inflate(R.layout.messages, parent, false);

        MessagesViewHolder mvh = new MessagesViewHolder(view, mListener);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MessagesViewHolder holder, int position) {
        MessageAttribute message =messagesList.get(position);
        holder.sendersName.setText(message.getSenders_name());
    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }



    public  class MessagesViewHolder extends RecyclerView.ViewHolder {
        private ImageView personalPicture;
        private TextView sendersName;
        public MessagesViewHolder(@NonNull View itemView,final OnItemClickListener listener) {
            super(itemView);
            personalPicture=itemView.findViewById(R.id.senderImage);
            sendersName=itemView.findViewById(R.id.sender);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }


}
*/
