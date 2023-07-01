package com.example.androidmaster.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(
        superHeroItemResponse: SuperHeroItemResponse,
        onItemSelected: (String) -> Unit
    ) {
        binding.tvSuperheroName.text = superHeroItemResponse.name
        binding.ivSuperHero

        Picasso.get().load(superHeroItemResponse.superheroImage.url).into(binding.ivSuperHero)
        binding.root.setOnClickListener { onItemSelected(superHeroItemResponse.superheroId) }
    }
}