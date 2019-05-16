package com.ctech.amir.photoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String KEY_INDEX = "index";


    private Button mPhoneButton;
    private Button mKeyButton;
    private Button mBottleButton;
    private Button mSpeakerButton;



    private TextView mQuestionTextView;





@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Log.d(TAG,"onCreate(Bundle) has been called!");

        setContentView(R.layout.activity_main);

        // Get a reference to the Question TextView and set its text to the question at the current index
        mQuestionTextView=findViewById(R.id.question_text_view);


        mBottleButton = findViewById(R.id.bottle_button);



        } // onCreate ends
}
