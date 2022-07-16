package com.example.text2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ShopActivity extends AppCompatActivity {

    private RadioGroup mRg1;
    private CheckBox mCb1;
    private CheckBox mCb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        mRg1 = findViewById(R.id.rg_1);
        mCb1 = findViewById(R.id.cb_1);
        mCb2 = findViewById(R.id.cb_2);
        mRg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton =radioGroup.findViewById(i);
                Toast.makeText(ShopActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        mCb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(ShopActivity.this,b?"选中":"未选中",Toast.LENGTH_SHORT).show();
            }
        });
        mCb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(ShopActivity.this,b?"选中":"未选中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}