package com.huewu.cleancodeexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ContentFragment extends Fragment {
    
    public interface OnContentListener {
        
        void onContentImage();
        void onContentText();
    }

    //private OnContentListener mCallback;
    private View mImageView;
    private View mTextView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content, null);
        mImageView = view.findViewById(R.id.content_image);
        mTextView = view.findViewById(R.id.content_text);
        
        return view;
    }
        
    public void showImage(){
        mImageView.setVisibility(View.VISIBLE);
        mTextView.setVisibility(View.GONE);
    }
    
    public void showText(){
        mImageView.setVisibility(View.GONE);
        mTextView.setVisibility(View.VISIBLE);
    }
    

}//end of class
