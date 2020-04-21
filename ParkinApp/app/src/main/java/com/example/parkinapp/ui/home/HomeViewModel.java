package com.example.parkinapp.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.widget.TextView;

import com.example.parkinapp.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

   public HomeViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("Open Spaces: 26");
    }




    public LiveData<String> getText() {
        return mText;
    }
}