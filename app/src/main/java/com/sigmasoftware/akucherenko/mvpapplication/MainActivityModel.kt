package com.sigmasoftware.akucherenko.mvpapplication

import com.sigmasoftware.akucherenko.mvpapplication.model.Item
import com.sigmasoftware.akucherenko.mvpapplication.model.MockGenerator
import kotlinx.coroutines.*

class MainActivityModel {
    val items = MockGenerator.generateItems(3)

    fun addItem(id: Int, name: String) {
        items.add(Item(id, name))
    }
}