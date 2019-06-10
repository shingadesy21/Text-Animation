package com.example.animation;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
TextView textView;
ListView listView;
String[] anim={"ZoomIn","ZoomOut","FadeIn","FadeOut","RotateIn","RotateOut","Bounce","BounceIn","BounceInDown","BounceInLeft","BounceInRight","BounceInUp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        textView = findViewById(R.id.textview);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,anim);
        listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String type=listView.getItemAtPosition(position).toString();
        if(type.equals("ZoomIn"))
        {
            YoYo.with(Techniques.ZoomIn).duration(600).repeat(1).playOn(textView);

        }
        if(type.equals("ZoomOut"))
        {
            YoYo.with(Techniques.ZoomOut).duration(600).repeat(1).playOn(textView);

        }
        if(type.equals("FadeIn"))
        {
            YoYo.with(Techniques.FadeIn).duration(600).repeat(1).playOn(textView);

        }  if(type.equals("FadeOut"))
        {
            YoYo.with(Techniques.FadeOut).duration(600).repeat(1).playOn(textView);

        }  if(type.equals("RotateIn"))
        {
            YoYo.with(Techniques.RotateIn).duration(600).repeat(1).playOn(textView);

        }if(type.equals("RotateOut"))
        {
            YoYo.with(Techniques.RotateOut).duration(600).repeat(1).playOn(textView);

        }
        if(type.equals("Bounce"))
        {
            YoYo.with(Techniques.Bounce).duration(600).repeat(1).playOn(textView);

        }
        if(type.equals("BounceIn"))
        {
            YoYo.with(Techniques.BounceIn).duration(600).repeat(1).playOn(textView);

        }if(type.equals("BounceInDown"))
        {
            YoYo.with(Techniques.BounceInDown).duration(600).repeat(1).playOn(textView);

        }if(type.equals("BounceInLeft"))
        {
            YoYo.with(Techniques.BounceInLeft).duration(600).repeat(1).playOn(textView);

        }
        if(type.equals("BounceInRight"))
        {
            YoYo.with(Techniques.BounceInRight).duration(600).repeat(1).playOn(textView);

        }
        if(type.equals("BounceInUp"))
        {
            YoYo.with(Techniques.BounceInUp).duration(600).repeat(1).playOn(textView);

        }


    }
});


    }
}
