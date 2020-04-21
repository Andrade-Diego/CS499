package com.example.parkinapp.ui.home;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.example.parkinapp.MainActivity;
import com.example.parkinapp.R;

public class HomeFragment extends Fragment {
    //variable to check if refresh button has been clicked. Needed for testing purposes should not be needed in final product
    boolean clicked = false;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final ImageButton imageButton = (ImageButton) root.findViewById(R.id.button);
        final ImageView image = (ImageView) root.findViewById(R.id.imageView3);
        final Activity activity = getActivity();
        final TextView text = (TextView) root.findViewById(R.id.text_home);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){

                clicked = !clicked;

                String imageUrl = "https://ichef.bbci.co.uk/news/660/cpsprodpb/10A0/production/_107065240_gettyimages-937322092.jpg";
                //String imageUrl = "localhost/parking.JPG";
                URL url = null;
                try {
                    url = new URL(imageUrl);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                HttpURLConnection conn = null;
                try {
                    conn = (HttpURLConnection) url.openConnection();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                InputStream is = null;
                try {
                    is = conn.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Bitmap img = BitmapFactory.decodeStream(is);

                if(clicked == true) {
                    int src = R.mipmap.parking2;
                    image.setImageResource(src);

                    text.setText("Open Spaces: 26");
                    text.setTextColor(Color.parseColor("#8BC34A"));
                }
                else {
                    //image.setImageResource(R.mipmap.parking);
                    image.setImageBitmap(img);
                    text.setText("Open Spaces: 0");
                    text.setTextColor(Color.RED);
                }


            }
        });


        return root;
    }
}
