package com.scujcc.criminalintent;

import android.annotation.SuppressLint;
import android.os.Build;

import java.util.UUID;
import java.time.LocalDateTime;

import androidx.annotation.RequiresApi;

public class Crime {
    private UUID mId;
    private LocalDateTime mDate;
    private String mTitle;
    private boolean mSolved;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Crime(){
        mId=UUID.randomUUID();
        mDate=LocalDateTime.now();
    }

    public UUID getId() {
        return mId;
    }

    public LocalDateTime getDate() {
        return mDate;
    }

    public void setDate(LocalDateTime date) {
        mDate = date;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
