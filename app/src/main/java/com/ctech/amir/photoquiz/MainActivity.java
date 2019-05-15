package com.ctech.amir.photoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private Button mPhoneButton;
    private Button mKeyButton;
    private Button mBottleButton;
    private Button mSpeakerButton;



    private TextView mQuestionTextView;

    private Question[] mQuestionBank = new Question[] {


            new Question(R.string.bottle_question, mBottleButton)
    }










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
