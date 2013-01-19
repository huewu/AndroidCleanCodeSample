package com.huewu.cleancodeexample.clean;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;

import com.googlecode.androidannotations.annotations.EFragment;
import com.googlecode.androidannotations.annotations.ViewById;
import com.huewu.cleancodeexample.R;
import com.squareup.otto.Subscribe;

@EFragment(R.layout.content)
public class CleanContentFragment extends Fragment {
    
    @ViewById(R.id.content_image)
    View mImageView;
    
    @ViewById(R.id.content_text)
    View mTextView;

    private EventDispatcher mEventDispatcher = new EventDispatcher();
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        
        MyEventBus.getBus().register(mEventDispatcher);
    }
    
    @Override
    public void onDetach() {
        super.onDetach();
        
        MyEventBus.getBus().unregister(mEventDispatcher);
    }
    
    public class EventDispatcher {
        @Subscribe
        public void showImage(ShowImageEvent event){
            mImageView.setVisibility(View.VISIBLE);
            mTextView.setVisibility(View.GONE);
        }
        
        @Subscribe
        public void showText(ShowTextEvent event){
            mImageView.setVisibility(View.GONE);
            mTextView.setVisibility(View.VISIBLE);
        }
        
    }

}//end of class
