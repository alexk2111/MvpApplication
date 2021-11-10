package com.sigmasoftware.akucherenko.mvpapplication

interface MainActivityPresenterInterface {
    fun updateItemInfoTextView(info: String)
    fun showProgressBar()
    fun hideProgressBar()
}