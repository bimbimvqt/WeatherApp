package com.example.weatherapp;

import android.media.Image;

public class WeatherInfo {

    public int degree;
    public Image image;
    public double degreeDot;

    public WeatherInfo(int degree, Image image, double degreeDot) {
        this.degree = degree;
        this.image = image;
        this.degreeDot = degreeDot;
    }
}
