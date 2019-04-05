package com.example.mytictactoe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.security.KeyStore;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    int myActiveplayer=0;
    // for cross its0 and for cricle its 1
    int[] mygatestate ={2,2,2,2,2,2,2,2,2};


    public void imageTapped(View view){
        ImageView myImage = (ImageView) view;

       // Log.i("tag is","image number is :"+ myImage.getTag().toString());
        int myimagecount = Integer.parseInt(myImage.getTag().toString());
        if(mygatestate[myimagecount]==2) {
            mygatestate[myimagecount] = myActiveplayer;

            if (myActiveplayer == 0) {
                // ImageView myImage = (ImageView) view;
                myImage.setImageResource(R.drawable.cross);
                myImage.animate().rotation(180).setDuration(1000);
                myActiveplayer = 1;
            } else {
                //ImageView myImage = (ImageView) view;
                myImage.setImageResource(R.drawable.circle);
                myImage.animate().rotation(180).setDuration(1000);
                myActiveplayer = 0;
            }

        }
        else {
            Log.i("msg","this is alsready filled");
        }





        }





    public void playagain(View view)
        {
            //set the array to 2
            for (int i=0;i<mygatestate.length;i++){
                mygatestate[i]=2;
            }

            //set active player to 0
            myActiveplayer=0;

            //reset the images
            LinearLayout myll = (LinearLayout)findViewById(R.id.llone);
            for (int i =0;i< myll.getChildCount();i++){
                ((ImageView) myll.getChildAt(i)).setImageResource(R.drawable.test);
            }
            LinearLayout myll1 = (LinearLayout)findViewById(R.id.lltwo);
            for (int i =0;i< myll1.getChildCount();i++){
                ((ImageView) myll1.getChildAt(i)).setImageResource(R.drawable.test);
            }
            LinearLayout myll2 = (LinearLayout)findViewById(R.id.llthree);
            for (int i =0;i< myll2.getChildCount();i++){
                ((ImageView) myll2.getChildAt(i)).setImageResource(R.drawable.test);
            }

        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
