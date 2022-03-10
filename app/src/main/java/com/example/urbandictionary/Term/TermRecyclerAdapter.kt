package com.example.urbandictionary.Term

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.urbandictionary.R

class TermRecyclerAdapter: RecyclerView.Adapter<TermViewHolder>() {

    var terms = emptyList<Term>()
    //number of rows
    override fun getItemCount(): Int = terms.size
    //dequeueReuseIdentifier
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TermViewHolder {
        val termView = LayoutInflater.from(parent.context).inflate(R.layout.term_cell,parent,false)
        return TermViewHolder(termView)
    }
    //cellForRowAt indexPath
    override fun onBindViewHolder(holder: TermViewHolder, position: Int) {
        val term = terms[position]
        holder.wordLabel.text = term.word
        holder.definitionLabel.text = term.htmlDefinition
        holder.term = term
    }

    fun update(terms: List<Term>) {
        this.terms = terms
        notifyDataSetChanged()
    }
}