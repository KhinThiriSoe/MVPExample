package com.example.khinthirisoe.mvpexample;

/**
 * Created by khinthirisoe on 7/22/16.
 */
public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void onLogin(String username, String password, OnLoginListener listener) {
        if (username.equals("thiri") && password.equals("123")) {
            listener.onLoginSuccess("1234");
        } else {
            listener.onLoginFailed();
        }
    }
}