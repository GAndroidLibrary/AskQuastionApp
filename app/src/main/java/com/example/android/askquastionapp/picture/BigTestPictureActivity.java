package com.example.android.askquastionapp.picture;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.askquastionapp.R;

import java.io.IOException;
import java.io.InputStream;

public class BigTestPictureActivity extends AppCompatActivity {
    public static void start(Context context) {
        Intent intent = new Intent(context, BigTestPictureActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_test_picture);
        PhotoImageView bigImageView = findViewById(R.id.big_image_view);
        try {
            InputStream inputStream = getResources().getAssets().open("world.jpg");
            bigImageView.setImageResource(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
