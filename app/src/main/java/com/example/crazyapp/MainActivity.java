package com.example.crazyapp;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> listColoredCells = new ArrayList<>();
    int selColor;
    Button selColor_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selColor = -1;
        selColor_btn = (Button)  findViewById(R.id.selColor_btn);
    }

    public void updateSelColor(View view){

        switch (view.getId()){
            case R.id.red_btn:
                selColor = 0xFFFB0606;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.fucsia_btn:
                selColor = 0xFFFD00D3;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.blue_btn:
                selColor = 0xFF0439DA;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.cyan_btn:
                selColor = 0xFF04FBFB;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.green_btn:
                selColor = 0xFF25FF00;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.yellow_btn:
                selColor = 0xFFFFF600;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.orange_btn:
                selColor = 0xFFFF8400;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.purple_btn:
                selColor = 0xFF673AB7;
                selColor_btn.setBackgroundColor(selColor);
                break;
            case R.id.white_btn:
                selColor = -1;
                selColor_btn.setBackgroundResource(R.drawable.button_border);
                break;
            default:
                break;
        }
    }

    public void colorCell(View view) {

        if(!listColoredCells.contains(view.getId()))
            listColoredCells.add(view.getId());

        if(selColor != -1){
            findViewById(view.getId()).setBackgroundColor(selColor);
        }
        else{
            findViewById(view.getId()).setBackgroundResource(R.drawable.button_border);
        }
    }

    public void cleanDraw(View view) {
        for (Integer i: listColoredCells){
            findViewById(i).setBackgroundResource(R.drawable.button_border);
        }
    }

    public void saveDraw(View view) {

    }


}