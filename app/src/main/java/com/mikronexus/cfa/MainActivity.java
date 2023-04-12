package com.mikronexus.cfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mikronexus.cfa.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.packageName.setText(getApplicationContext().getPackageName());
        binding.proceed.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.mikronexus.dejavoo", "com.mikronexus.dejavoo.MainActivity");
            startActivity(intent);
        });
    }
}