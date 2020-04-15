package com.example.parkinapp.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

   public HomeViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is not home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}