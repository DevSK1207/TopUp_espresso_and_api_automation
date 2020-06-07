package com.example.topup;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button topupbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonX = (Button)findViewById(R.id.topupButton);

       topupbutton = findViewById(R.id.topupButton);
       topupbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               Intent intent = new Intent(MainActivity.this, TopupDetailsActivity.class);
              startActivity(intent);

               Toast.makeText(MainActivity.this, "Start new activity", Toast.LENGTH_SHORT).show();


           }
       });



    }
}
