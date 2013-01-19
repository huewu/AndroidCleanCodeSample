
package com.huewu.cleancodeexample.clean;

import android.support.v4.app.Fragment;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EFragment;
import com.huewu.cleancodeexample.R;

@EFragment(R.layout.header)
public class CleanHeaderFragment extends Fragment {

    @Click(R.id.header_image)
    void onClickImage() {
        MyEventBus.getBus().post(new ShowImageEvent());
    }

    @Click(R.id.header_text)
    void onClickText() {
        MyEventBus.getBus().post(new ShowTextEvent());
    }

}// end of class
