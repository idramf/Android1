package com.example.com.technologyworld;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    final List<Bitmap> imageList = new ArrayList<>();
    final List<String> textList = new ArrayList<>();

    private Singleton() {}

    static Singleton getInstance() {
        if( instance == null ) {
            instance = new Singleton();
        }
        return instance;
    }

    private static Singleton instance;

}
