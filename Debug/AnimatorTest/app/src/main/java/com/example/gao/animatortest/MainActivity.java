package com.example.gao.animatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = (Button) findViewById(R.id.Button);
        // 步骤1:创建 需要设置动画的 视图View
        Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animation);
        // 步骤2:创建 动画对象 并传入设置的动画效果xml文件
        mButton.startAnimation(translateAnimation);

    }
}
