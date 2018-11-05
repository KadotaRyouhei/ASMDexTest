package com.jd.lib.asmdextest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shanliang on 2018/10/31.
 */

public class SecondActivity  extends AppCompatActivity {

    private TextView tvContent;
    private Queue<Integer> queue = new LinkedList<>();
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private int store = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        init();
        initData();
    }

    private void init() {
        tvContent = (TextView) findViewById(R.id.tv_content);
    }

    private void initData() {
        initText();
        initNum(20);
        Counter2 counter2 = new Counter2();
        counter2.test2();
    }

    private void initText() {
        tvContent.setText(ContentUtil.getInstance().getContent());
    }

    private void initNum(int num) {
        store = num;
    }
}

