package com.example.projebir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projebir.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ego.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.giving.isChecked = false
                binding.happines.isChecked = false
                binding.optimism.isChecked = false
                binding.kindness.isChecked = false
                binding.respect.isChecked = false

            } else {

            }


        }


    }


}
