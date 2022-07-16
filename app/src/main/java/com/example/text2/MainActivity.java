package com.example.text2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.text2.util.ToastUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //声明控件
    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        mBtnLogin = findViewById(R.id.btn_login);
        mEtUser = findViewById(R.id.et_1);
        mEtPassword = findViewById(R.id.et_2);
//        //实现跳转1
//        mBtnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = null;
//                intent = new Intent(MainActivity.this,FunctionActivity.class);
//                startActivity(intent);
//            }
//        });

        //匹配对应的用户名密码才能登陆
        mBtnLogin.setOnClickListener(this);
    }
    public void onClick(View v){
        //获取用户名密码
        String username = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        //设置弹出的内容
        String ok = "登陆成功！";
        String fail = "账号或者密码有误，请重新登陆！";
        Intent intent = null;
        //假设正确密码 ccl 123456
        if(username.equals("ccl")&&password.equals("123456")) {
            //Toast普通版
//            Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();

            //直接用这个封装好的类，就用这一句
            ToastUtil.showMsg(MainActivity.this,ok);
            //正确则跳转
            intent = new Intent(MainActivity.this, SlideActivity.class);
            startActivity(intent);
        }else{
            //不正确,toast
            //提升版，居中
//            Toast toastCenter = Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
//            toastCenter.setGravity(Gravity.CENTER,0,0);//直接点0
//            toastCenter.show();
            ToastUtil.showMsg(MainActivity.this,fail);
        }
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

}