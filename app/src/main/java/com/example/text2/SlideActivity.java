package com.example.text2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SlideActivity extends AppCompatActivity {
    //声明控件
    private ImageView mIvHead;
    private SlideMenu slideMenu;
    private Button mBtnShop;
    private Button mBtnMarket;
    private Button mBtnExercise;
    private Button mBtnRead;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        //找控件
        mIvHead = findViewById(R.id.iv_head);
        slideMenu = findViewById(R.id.slideMenu);
        mBtnShop = findViewById(R.id.btn_main_1);
        mBtnMarket = findViewById(R.id.btn_main_2);
        mBtnExercise = findViewById(R.id.btn_main_3);
        mBtnRead = findViewById(R.id.btn_main_4);
        //实现侧滑,点击加侧滑
       mIvHead.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                slideMenu.switchMenu();//开关侧滑界面
           }
       });

        setListener();
    }

    private void setListener(){
        OnClick onkilck = new OnClick();
        //对每个按钮进行setOnclickListener()
        mBtnShop.setOnClickListener(onkilck);
        mBtnMarket.setOnClickListener(onkilck);
        mBtnExercise.setOnClickListener(onkilck);
        mBtnRead.setOnClickListener(onkilck);

    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=null;
            switch (view.getId()){
                case R.id.btn_main_1:
                    intent = new Intent(SlideActivity.this,ShopActivity.class);
                    break;
                case R.id.btn_main_2:
                    intent = new Intent(SlideActivity.this,MarketActivity.class);
                    break;
                case R.id.btn_main_3:
                    intent = new Intent(SlideActivity.this,ExerciseActivity.class);
                    break;
                case R.id.btn_main_4:
                    intent = new Intent(SlideActivity.this,ReadActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
