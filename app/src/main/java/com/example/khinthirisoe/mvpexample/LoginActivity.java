package com.example.khinthirisoe.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.login_email_edit_text)
    EditText edtEmail;
    @BindView(R.id.login_password_edit_text)
    EditText edtPassword;
    @BindView(R.id.login_submit_button)
    Button btnSubmit;

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        if(BuildConfig.DEBUG){
            edtEmail.setText("thiri");
            edtPassword.setText("123");
        }

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login(edtEmail.getText().toString(),edtPassword.getText().toString());
            }
        });

    }


}
