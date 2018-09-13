package com.beyzabudak.termometer.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.beyzabudak.termometer.R;
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread mSplashThread;//thread classdan obje olustrduk uygulamann 4 saniye uyutulmasi icin
        mSplashThread = new Thread(){
            @Override public void run(){
                try {

                    synchronized(this){
                        wait(3000);
                    }
                }catch(InterruptedException ex){

                }
                finally{

                    Intent gec=new Intent(SplashActivity.this , LoginActivity.class);
                    startActivity(gec);
                    finish();
                }

            }

        };//thread objesini olustrduk ve istedmz sekilde sekillendrdik
        mSplashThread.start();// thread objesini calistriyoruz
    }
}