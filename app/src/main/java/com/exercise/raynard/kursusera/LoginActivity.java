package com.exercise.raynard.kursusera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class LoginActivity extends AppCompatActivity {

    CarouselView carouselView;
    int [] carouselImage = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(carouselImage.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(carouselImage[position]);
        }
    };

    public void login(View view) {
    }

    public void signIn(View view) {
    }
}
