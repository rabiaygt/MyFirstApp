package com.rabiayigit.firstproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView, imageView2;
    private Button button;
    private boolean isFirstClick = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstClick) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.GONE);
                    isFirstClick = false;
                } else {
                    imageView.setVisibility(View.GONE);
                    imageView2.setVisibility(View.VISIBLE);
                    isFirstClick = true;
                }
            }
        });

    }

//    public void changeImage(View view){
//        ImageView metallicaImage=findViewById(R.id.imageView);
//        metallicaImage.setImageResource(R.drawable.image2);
//    }


}