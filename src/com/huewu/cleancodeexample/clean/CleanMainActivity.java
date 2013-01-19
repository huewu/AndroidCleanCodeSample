
package com.huewu.cleancodeexample.clean;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.FragmentByTag;
import com.huewu.cleancodeexample.ContentFragment;
import com.huewu.cleancodeexample.HeaderFragment;
import com.huewu.cleancodeexample.R;

@EActivity(R.layout.activity_main)
public class CleanMainActivity extends FragmentActivity {

    @FragmentByTag("header")
    HeaderFragment mHeaderFrag;

    @FragmentByTag("content")
    ContentFragment mContentFrag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tr = fm.beginTransaction();
        tr.replace(R.id.header, new CleanHeaderFragment_());
        tr.replace(R.id.content, new CleanContentFragment_());
        tr.commit();

        // doSleep();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    // @Background
    // public void doSleep(){
    // try {
    // Thread.sleep(5000);
    // } catch (InterruptedException e) {
    // }
    // }

}// end of class
