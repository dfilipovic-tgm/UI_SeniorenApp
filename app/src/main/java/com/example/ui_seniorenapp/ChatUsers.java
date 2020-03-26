package com.example.ui_seniorenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChatUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_users);
    }

    public void goToChat(View view) {
        startActivity(new Intent(ChatUsers.this, ChatActivity.class));
    }

}
