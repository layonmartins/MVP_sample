package com.layon.mvp_sample.MVP

interface BaseView<T> {
    var presenter: T
    fun bindViews()
}

interface BasePresenter {
    fun start()
}