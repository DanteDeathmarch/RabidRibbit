package com.example.rabbidribbet;

import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void oncreate (bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main) ;
    getWindow() .addflags(WindowManager.layoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void startGame (view view) {
    Gameview gameview = new Gameview(this);
    setContentview(gameview)
    }
}
