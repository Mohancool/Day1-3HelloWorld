package com.mohan1614044.day1helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

        EditText editText = (EditText)findViewById(R.id.sendMsg);
        String message = editText.getText().toString();
        Intent intent = new Intent(this,Message_Activity.class);
        intent.putExtra("Extra_Message",message);
        startActivity(intent);
    }
}
