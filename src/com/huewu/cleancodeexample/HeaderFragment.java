package com.huewu.cleancodeexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class HeaderFragment extends Fragment {
    
    public interface OnHeaderListener {
        
        void onShowImage();
        void onShowText();
    }

    private OnHeaderListener mCallback;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.header, null);
        
        view.findViewById(R.id.header_image).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallback.onShowImage();

            }
        });
        
        view.findViewById(R.id.header_text).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCallback != null)
                    mCallback.onShowText();
            }
        });
        
        return view;
    }
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        
        try {
            mCallback = (OnHeaderListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeaderListener");
        }    
    }
    

}//end of class
