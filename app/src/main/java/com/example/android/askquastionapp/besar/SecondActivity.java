package com.example.android.askquastionapp.besar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.android.askquastionapp.R;
import com.example.android.askquastionapp.databinding.ActivitySecondBinding;

/**
 * 二阶贝塞尔函数
 */
public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    public static void launch(Context context){
        context.startActivity(new Intent(context,SecondActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil. setContentView(this, R.layout.activity_second);
        binding.setPresenter(this);
    }
}
