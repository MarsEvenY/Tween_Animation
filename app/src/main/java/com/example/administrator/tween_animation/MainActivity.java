package com.example.administrator.tween_animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView iv;
    private Animation rotate, scale, translate, alpha;
    //private Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate); //获取旋转动画资源
        scale = AnimationUtils.loadAnimation(this, R.anim.anim_scale); //获取缩放动画
        translate = AnimationUtils.loadAnimation(this, R.anim.anim_translate); //获取平移动画
        alpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha); //获取透明度变化

        iv = (ImageView) findViewById(R.id.imageview1);
        /*
        bt1 = (Button) findViewById(R.id.bt1); //旋转
        bt2 = (Button) findViewById(R.id.bt2); //平移
        bt3 = (Button) findViewById(R.id.bt3); //缩放
        bt4 = (Button) findViewById(R.id.bt4); //透明度*/

    }

    public void MyClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                iv.startAnimation(rotate);
                break;
            case R.id.bt2:
                iv.startAnimation(translate);
                break;
            case R.id.bt3:
                iv.startAnimation(scale);
                break;
            case R.id.bt4:
                iv.startAnimation(alpha);
                break;
        }
    }
}
