package com.example.khinthirisoe.mvpexample;

/**
 * Created by khinthirisoe on 7/22/16.
 */
public interface LoginView {
    void toastLoginSuccess(String token);
    void toastLoginFailed();
}
