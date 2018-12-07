package com.mohan1614044.day1helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Message_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_);

        TextView textView =(TextView)findViewById(R.id.showMsg);


        Intent intent =getIntent();
        String message = intent.getStringExtra("Extra_Message");

        textView.setText(message);

    }
    public void openFinalActivity(View view){
       startActivity(new Intent(this,final_Activity.class));

    }
}
