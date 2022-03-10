package com.example.urbandictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.urbandictionary.Term.Term
import com.example.urbandictionary.Term.TermViewHolder
import kotlinx.android.synthetic.main.activity_word_definition.*
import kotlinx.android.synthetic.main.term_cell.definitionLabel

class WordDefinitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_definition)

        val term = intent.getSerializableExtra(TermViewHolder.termKey) as? Term
        term?.let {
            supportActionBar?.title = it.word
            definitionLabel.text = it.htmlDefinition
            likesLabel.text = "Likes:  ${it.likes}"
            dislikesLabel.text = "Dislikes: ${it.dislikes}"
        }

    }
}
