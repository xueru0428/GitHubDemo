package com.atguigu.administrator.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"修改代码了",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"更新一下",Toast.LENGTH_SHORT).show();
    }
}
