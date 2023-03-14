package com.example.mandi.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mandi.R
import com.example.mandi.databinding.FragmentSellProduceBinding

class SellProduceFragment : Fragment() {
    private var _binding: FragmentSellProduceBinding? = null
    private val binding: FragmentSellProduceBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSellProduceBinding.inflate(inflater)
        return binding.root
    }
}
