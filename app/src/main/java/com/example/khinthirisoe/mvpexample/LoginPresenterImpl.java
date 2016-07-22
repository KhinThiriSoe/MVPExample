package com.example.khinthirisoe.mvpexample;

/**
 * Created by khinthirisoe on 7/22/16.
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginListener {

    LoginView view;
    LoginInteractor interactor;

    @Override
    public void login(String username, String password) {
        interactor.onLogin(username, password, this);
    }

    @Override
    public void onLoginSuccess(String token) {
        if (view != null) {
            view.toastLoginSuccess(token);
        }
    }

    @Override
    public void onLoginFailed() {
        if (view != null) {
            view.toastLoginFailed();
        }
    }
}
