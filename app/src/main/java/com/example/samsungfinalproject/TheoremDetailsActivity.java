package com.example.samsungfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class TheoremDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theorem_details);

        // Получаем данные из Intent
        Intent intent = getIntent();
        String theoremTitle = intent.getStringExtra("theorem_title");
        String theoremContent = intent.getStringExtra("theorem_content");
        String theoremImagePath = intent.getStringExtra("theorem_image_path");

        // Находим View для отображения заголовка, текста и фото теоремы
        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView contentTextView = findViewById(R.id.contentTextView);
        ImageView imageView = findViewById(R.id.imageView);

        // Устанавливаем текст заголовка и текста теоремы
        titleTextView.setText(theoremTitle);
        contentTextView.setText(theoremContent);

        // Загружаем фото теоремы с помощью Glide
        Glide.with(this)
                .load(theoremImagePath)
                .into(imageView);
    }
}
