package com.ctech.amir.photoquiz;



public class Question {



    private int mTextResId;
    private int mButtonNumber;

    public Question(int textResId, int number) {
        mTextResId = textResId;
        mButtonNumber = number;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public int getmButtonNumber() {
        return mButtonNumber;
    }

}