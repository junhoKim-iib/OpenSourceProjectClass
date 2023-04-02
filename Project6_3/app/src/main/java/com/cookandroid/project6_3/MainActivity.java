package com.cookandroid.project6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabSpecDog.setContent(R.id.dog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabSpecCat.setContent(R.id.cat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.rabbit);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("horse").setIndicator("말");
        tabSpecHorse.setContent(R.id.horse);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);



    }
}