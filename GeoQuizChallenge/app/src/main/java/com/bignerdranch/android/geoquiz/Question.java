package com.bignerdranch.android.geoquiz;

/**
 * Created by joseluiscastillo on 9/8/15.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    //Constructor
    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
