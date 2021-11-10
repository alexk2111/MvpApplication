package com.sigmasoftware.akucherenko.mvpapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sigmasoftware.akucherenko.mvpapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainActivityPresenterInterface {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainActivityPresenter = MainActivityPresenter(this)

        binding.buttonAddItem.setOnClickListener() {
            mainActivityPresenter.addItem(
                binding.editTextId.text.toString().toInt(),
                binding.editTextName.text.toString()
            )
            binding.editTextId.text = null
            binding.editTextName.text = null
        }

        binding.buttonShowItems.setOnClickListener() {
            binding.textViewItems.text =
                mainActivityPresenter.showItems()
        }
    }

    override fun updateItemInfoTextView(info: String) {
    }

    override fun showProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        binding.progressBar.visibility = View.INVISIBLE
    }
}