package org.rnd.utils;

import org.testng.IExecutionListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.BeforeTest;

public class ListenerExSel implements ISuiteListener, IExecutionListener {

    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
//        Base base = new Base();
    }

    @BeforeTest
    @Override
    public void onExecutionStart() {
        IExecutionListener.super.onExecutionStart();
        Base base = new Base();
    }
}
