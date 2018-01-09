package com.example.mackel.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import junit.framework.Test;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContentPageActivity extends AppCompatActivity {

    @BindView(R.id.btnTest)
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_page);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnTest)
    public void onViewClicked() {
        startActivity(new Intent(ContentPageActivity.this, TestPageActivity.class));
    }
}
