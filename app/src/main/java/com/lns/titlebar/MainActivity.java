package com.lns.titlebar;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends TitleBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("标题");      //设置标题名称
        showBackwardView(R.string.text_back,true);          //设置返回按钮并显示
        showForwardView(R.string.text_forward, true);       //设置提交按钮并显示

    }

    /**
     * 重写点击返回按钮操作,返回按钮点击后触发
     * @param backwardView
     */
    @Override
    protected void onBackward(View backwardView) {
        super.onBackward(backwardView);
    }

    /**
     * 重写点击提交按钮操作,提交按钮点击后触发
     * @param forwardView
     */
    @Override
    protected void onForward(View forwardView) {
        super.onForward(forwardView);
    }

}
