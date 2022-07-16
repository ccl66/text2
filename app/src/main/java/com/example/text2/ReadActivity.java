package com.example.text2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.text2.Adapter.ReadAdapter;

public class ReadActivity extends AppCompatActivity {

    private RecyclerView mRvFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        mRvFinish = findViewById(R.id.rv_finish);

        //利用adapter显示item
        mRvFinish.setLayoutManager(new LinearLayoutManager(ReadActivity.this));
        //设置adapter
        mRvFinish.setAdapter(new ReadAdapter(ReadActivity.this, new ReadAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(ReadActivity.this, "click..." + pos, Toast.LENGTH_SHORT).show();
            }
        }));
    }
}