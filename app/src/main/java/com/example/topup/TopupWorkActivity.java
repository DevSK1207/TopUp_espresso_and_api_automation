package com.example.topup;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myloadingbutton.MyLoadingButton;

import at.markushi.ui.CircleButton;
import br.com.simplepass.loadingbutton.customViews.CircularProgressButton;

import static com.example.topup.R.color.colorAccent;
import static com.example.topup.R.color.colorPrimary;

public class TopupWorkActivity extends AppCompatActivity {

    TextView text;
    Button airtel,robi,gp,banlk,tlt, pre, post;
    ImageView opimg;
    CircleButton arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup_work);

        text = findViewById(R.id.catchNum);
        opimg = findViewById(R.id.operatorIcon);
        arrow = findViewById(R.id.imageView);






        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText(str);

        airtel = findViewById(R.id.airtel);
        robi = findViewById(R.id.robi);
        banlk = findViewById(R.id.banglalink);
        gp = findViewById(R.id.gp);
        tlt = findViewById(R.id.teletalk);
        pre = findViewById(R.id.prepaid);
        post = findViewById(R.id.postpaid);

        if (str.trim().contains("016")){
            opimg.setImageResource(R.drawable.airtel);
            airtel.setBackgroundColor(getResources().getColor(colorPrimary));
            pre.setBackgroundColor(getResources().getColor(colorPrimary));
        }else if (str.trim().contains("019")){
            opimg.setImageResource(R.drawable.ban);
            banlk.setBackgroundColor(getResources().getColor(colorPrimary));
            pre.setBackgroundColor(getResources().getColor(colorPrimary));
        }else if (str.trim().contains("017")){
            opimg.setImageResource(R.drawable.gp);
            gp.setBackgroundColor(getResources().getColor(colorPrimary));
            pre.setBackgroundColor(getResources().getColor(colorPrimary));
        }else if (str.trim().contains("015")){
            opimg.setImageResource(R.drawable.tl);
            tlt.setBackgroundColor(getResources().getColor(colorPrimary));
            pre.setBackgroundColor(getResources().getColor(colorPrimary));
        }else if (str.trim().contains("018")){
            opimg.setImageResource(R.drawable.robi);
            robi.setBackgroundColor(getResources().getColor(colorPrimary));
            pre.setBackgroundColor(getResources().getColor(colorPrimary));
        }else if (str.trim().contains("013")){
            opimg.setImageResource(R.drawable.gp);
            gp.setBackgroundColor(getResources().getColor(colorPrimary));
            pre.setBackgroundColor(getResources().getColor(colorPrimary));
        }else {
            opimg.setImageResource(R.drawable.airtel);
            airtel.setBackgroundColor(getResources().getColor(colorPrimary));
            pre.setBackgroundColor(getResources().getColor(colorPrimary));
        }

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pre.setBackgroundColor(getResources().getColor(colorPrimary));
                post.setBackgroundColor(getResources().getColor(R.color.gray));
                Toast.makeText(TopupWorkActivity.this,"Button Change",Toast.LENGTH_LONG).show();

            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post.setBackgroundColor(getResources().getColor(colorPrimary));
                pre.setBackgroundColor(getResources().getColor(R.color.gray));
                Toast.makeText(TopupWorkActivity.this,"Button Change",Toast.LENGTH_LONG).show();

            }
        });


        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TopupWorkActivity.this,"Topup Successful",Toast.LENGTH_LONG).show();
            }
        });







    }


}
