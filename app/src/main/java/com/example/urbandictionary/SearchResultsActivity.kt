package com.example.urbandictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.urbandictionary.Term.TermRecyclerAdapter
import kotlinx.android.synthetic.main.activity_search_results.*

class SearchResultsActivity : AppCompatActivity() {

    private val networkingService = NetworkingService()
    private val termAdapter =
        TermRecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_results)
        setupRecycler()

        val term = intent.getStringExtra(MainActivity.termKey)
        this.supportActionBar?.title = term
        getSearchResultsForTerm(term)
    }

    private fun setupRecycler() {
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = termAdapter
    }

    private fun getSearchResultsForTerm(term: String)  {
        networkingService.defineTerm(term).observe(this, Observer {terms -> // terms in
            terms.forEach{ println(it) } //it => $0
            termAdapter.update(terms)
        })
    }


}
