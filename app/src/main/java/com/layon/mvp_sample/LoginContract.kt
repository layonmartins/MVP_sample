package com.layon.mvp_sample

import com.layon.mvp_sample.MVP.BasePresenter
import com.layon.mvp_sample.MVP.BaseView

interface LoginContract {

    interface View : BaseView<LoginPresenter> {
        fun displayErrorMessage()
        fun displaySuccessToast()
        fun startHomeActivity()
    }

    interface Presenter : BasePresenter {
        fun isLoginValid(userName: String, password: String)
    }
}