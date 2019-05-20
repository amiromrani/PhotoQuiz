package com.ctech.amir.photoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String KEY_INDEX = "index";


    private Button mPhoneButton;
    private Button mKeyButton;
    private Button mBottleButton;
    private Button mSpeakerButton;



    private TextView mQuestionTextView;
    private Question[] mQuestionBank = new Question[] {


            new Question(R.string.bottle_question, true),
    };




    // the current question being shown
    private int mCurrentIndex = 0;


@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Log.d(TAG,"onCreate(Bundle) has been called!");

        setContentView(R.layout.activity_main);

        // Get a reference to the Question TextView and set its text to the question at the current index
        mQuestionTextView=findViewById(R.id.question_text_view);


        mBottleButton = findViewById(R.id.bottle_button);
        mBottleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // update the current index, but stay within the length of the array
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();


            }
        });

        mKeyButton = findViewById(R.id.key_button);
        mKeyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // update the current index, but stay within the length of the array
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();

            }
        });

        mPhoneButton = findViewById(R.id.phone_button);
        mPhoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // update the current index, but stay within the length of the array
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();

            }
        });

        mSpeakerButton = findViewById(R.id.speaker_button);
        mSpeakerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // update the current index, but stay within the length of the array
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();

            }
        });











        } // onCreate ends




    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart has been called!");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume has been called!");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause has been called!");
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Log.i(TAG, "onSaveInstanceState");
        saveInstanceState.putInt(KEY_INDEX, mCurrentIndex);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop has been called!");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy has been called!");
    }

    // encapsulate the update question code so we don't have to copy and paste it:
    private void updateQuestion() {
        Log.d(TAG, "updating question text", new Exception());
        int questionResourceId = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(questionResourceId);
    }



    // check whether the button clicked matches the answer in the resource
    private void checkAnswer(boolean userPressedTrue) {

        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();

        int messageResourceId = 0;

        if (userPressedTrue == answerIsTrue) {
            messageResourceId = R.string.correct_toast;
        } else {
            messageResourceId = R.string.incorrect_toast;
        }

        // you can make fancier Toast here if you want (from previous challenge)
        Toast.makeText(this, messageResourceId, Toast.LENGTH_SHORT).show();
    }





}
