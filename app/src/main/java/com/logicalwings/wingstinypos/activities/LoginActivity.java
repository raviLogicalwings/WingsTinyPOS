package com.logicalwings.wingstinypos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.logicalwings.wingstinypos.R;

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private TextView textForgetPassword;


    public LoginActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initData();
        initUi();

    }

    @Override
    public void initUi() {
        super.initUi();

        textForgetPassword = findViewById(R.id.text_forget_password);
        textForgetPassword.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
        context = LoginActivity.this;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text_forget_password:
                intent = new Intent(context, ForgetPasswordActivity.class);
                startActivity(intent);
                break;
        }
    }
}
