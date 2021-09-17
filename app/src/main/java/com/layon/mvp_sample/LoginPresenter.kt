package com.layon.mvp_sample

class LoginPresenter(private val view: LoginContract.View) : LoginContract.Presenter {

    override fun start() {
        view.bindViews()
    }

    override fun isLoginValid(userName: String, password: String) {
        if (userName.isEmpty() || password.isEmpty()) {
            view.displayErrorMessage()
        } else {
            if (userName == AuthUtils.USERNAME && password == AuthUtils.PASSWORD) {
                view.displaySuccessToast()
                view.startHomeActivity()
            } else {
                view.displayErrorMessage()
            }
        }
    }
}