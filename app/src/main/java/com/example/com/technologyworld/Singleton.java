package com.example.com.technologyworld;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    final List<ImageView> imageList = new ArrayList<>();
    final List<TextView> textList = new ArrayList<>();

    private Singleton() {}

    static Singleton getInstance() {
        if( instance == null ) {
            instance = new Singleton();
        }
        return instance;
    }

    private static Singleton instance;

}
