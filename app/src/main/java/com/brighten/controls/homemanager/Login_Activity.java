package com.brighten.controls.homemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {
Button login_btn;
    EditText username_editText;
    TextView or_textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        login_btn= (Button) findViewById(R.id.login_button);
        or_textView = (TextView) findViewById(R.id.or_textview);
        username_editText = (EditText) findViewById(R.id.username_login);
        login_btn.setOnClickListener(this);
        or_textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.login_button){
            Intent openNavigation = new Intent(this.getBaseContext(),Navigation_Activity.class);
            openNavigation.putExtra("name",username_editText.getText().toString());
            startActivity(openNavigation);
            finish();
        }
        if(view.getId()==R.id.or_textview){
            startActivity(new Intent(this,Signup_Activity.class));
        }
    }
}
