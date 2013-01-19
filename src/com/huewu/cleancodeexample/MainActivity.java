package com.huewu.cleancodeexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements HeaderFragment.OnHeaderListener, ContentFragment.OnContentListener {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tr = fm.beginTransaction();
        tr.replace(R.id.header, new HeaderFragment(), "header");
        tr.replace(R.id.content, new ContentFragment(), "content");
        tr.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public void onContentImage() {
    }

    @Override
    public void onContentText() {
    }

    @Override
    public void onShowImage() {
        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentByTag("content");
        if (frag instanceof ContentFragment ){
            ((ContentFragment) frag).showImage();
        }
    }

    @Override
    public void onShowText() {
        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentByTag("content");
        if (frag instanceof ContentFragment ){
            ((ContentFragment) frag).showText();
        }
    }
    
}//end of class
