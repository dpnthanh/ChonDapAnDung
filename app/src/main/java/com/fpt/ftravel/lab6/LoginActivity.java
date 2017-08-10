package com.fpt.ftravel.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsename;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AnhXa();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Checkusername = edtUsename.getText().toString();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                    intent.putExtra("username", edtUsename.getText().toString());

                    startActivity(intent);
            }
        });

    }



    private void AnhXa() {
        edtUsename = (EditText) findViewById(R.id.editUser);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
    }
}
