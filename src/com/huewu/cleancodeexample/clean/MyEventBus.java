package com.huewu.cleancodeexample.clean;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

public class MyEventBus {
    
    final static Bus mBus = new Bus(ThreadEnforcer.MAIN);
    
    public static Bus getBus(){
        return mBus;
    }
    
    private MyEventBus(){}
    
}//end of class
