package com.example.khinthirisoe.mvpexample;

/**
 * Created by khinthirisoe on 7/22/16.
 */
public interface LoginInteractor {
    void onLogin(String username, String password,OnLoginListener listener);

    interface OnLoginListener{
        void onLoginSuccess(String token);
        void onLoginFailed();
    }
}
