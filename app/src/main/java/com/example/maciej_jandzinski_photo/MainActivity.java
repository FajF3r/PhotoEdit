package com.example.maciej_jandzinski_photo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    SeekBar sliderR, sliderG, sliderB;
    ImageView image;
    TextView color;
    final int[] RValueInt = {0};
    final int[] GValueInt = {0};
    final int[] BValueInt = {0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);
        sliderR = findViewById(R.id.sliderRed);
        sliderG = findViewById(R.id.sliderGreen);
        sliderB = findViewById(R.id.sliderBlue);

        sliderR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int x = i;
                RValueInt[0] = x;
                ZmianaKoloru(RValueInt[0], GValueInt[0], BValueInt[0]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sliderG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int x = i;
                GValueInt[0] = x;
                ZmianaKoloru(RValueInt[0], GValueInt[0], BValueInt[0]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sliderB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int x = i;
                BValueInt[0] = x;
                ZmianaKoloru(RValueInt[0], GValueInt[0], BValueInt[0]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void ZmianaKoloru(int RValueInt, int GValueInt, int BValueInt) {
        TextView text = findViewById(R.id.color);
        text.setBackgroundColor(Color.rgb(RValueInt, GValueInt, BValueInt));
    }

    public void rotateRight(View view) {
        image.animate().rotation(90).start();
    }
}