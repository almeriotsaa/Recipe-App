package com.almerio.recipesapp2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.almerio.recipesapp2.R
import com.almerio.recipesapp2.adapter.RecipesAdapter
import com.almerio.recipesapp2.data.DataRecipes
import com.almerio.recipesapp2.databinding.FragmentVegetarianBinding

class VegetarianFragment : Fragment() {

    private var _binding : FragmentVegetarianBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVegetarianBinding.inflate(inflater,container, false)
        binding.rvVegetarion.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter = RecipesAdapter(DataRecipes.listVegetarian)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}