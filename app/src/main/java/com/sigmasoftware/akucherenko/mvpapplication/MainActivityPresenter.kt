package com.sigmasoftware.akucherenko.mvpapplication

import com.sigmasoftware.akucherenko.mvpapplication.model.Item

class MainActivityPresenter(private val view: MainActivityPresenterInterface) {

    private val model = MainActivityModel()

    fun addItem(id: Int, name: String){
            view.showProgressBar()
            model.addItem(id, name)
            view.hideProgressBar()
    }

    fun showItems(): String {
        view.showProgressBar()
        val items = model.items
        view.hideProgressBar()
        return items.joinToString(separator = "\n")
    }

}