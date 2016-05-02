package com.retailtracker.core.account;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.retailtracker.R;
import com.retailtracker.config.IntroSliderItems;
import com.retailtracker.widgets.slider.SliderView;

public class AppIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_intro);
        SliderView sliderView = (SliderView) findViewById(R.id.sliderView);
        IntroSliderItems sliderItems = new IntroSliderItems();
        if (!sliderItems.getItems().isEmpty()) {
            sliderView.setItems(getSupportFragmentManager(), sliderItems.getItems());
        } else {
            finish();
        }
    }
}
