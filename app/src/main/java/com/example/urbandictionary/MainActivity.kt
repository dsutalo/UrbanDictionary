package com.example.urbandictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //viewDidLoad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchButton.setOnClickListener {
            navigateToSearchResultsForWord(textField.text.toString())
        }
    }

    private fun navigateToSearchResultsForWord(word: String) {
        val intent = Intent(this, SearchResultsActivity::class.java)
        intent.putExtra(termKey, word)
        startActivity(intent)
    }

    //static let termKey = "termKey"

    companion object {
        const val termKey = "termKey"
    }
}
