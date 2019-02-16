package com.example.dante.alphalearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Alphalistviewconstructor {
    private String Name;
    private String Details;
    private int Photo;
    public Alphalistviewconstructor(String Name, String Details, int photo){
        this.Name= Name;
        this.Details=Details;
        this.Photo=Photo; }
    public String getName(){
        return Name; }
    public String getDetails() {
        return Details; }
    public int getPhoto() {
        return Photo; }
}

