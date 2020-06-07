package com.example.topup;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TopupDetailsActivity extends AppCompatActivity {
    EditText number;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup_details);

        number = findViewById(R.id.numberInput);
        arrow = findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum = number.getText().toString();
                if (number.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Empty is field",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), TopupWorkActivity.class);
                    intent.putExtra("message", phoneNum);
                    startActivity(intent);
                    Toast.makeText(TopupDetailsActivity.this, "Start new activity", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}
