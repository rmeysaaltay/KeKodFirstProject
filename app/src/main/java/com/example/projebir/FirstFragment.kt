package com.example.projebir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.core.graphics.createBitmap
import androidx.core.view.forEach
import androidx.core.view.isVisible
import com.example.projebir.databinding.FragmentFirstBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView


class FirstFragment : Fragment() {
    val bottomNavView by lazy {
        requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationBar)
    }
    val itemCount by lazy { bottomNavView.menu.size() }
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

        ego()

    }
    fun ego() {
        binding.ego.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                bottomNavView.visibility = View.GONE
                binding.giving.isChecked = false
                binding.happines.isChecked = false
                binding.optimism.isChecked = false
                binding.kindness.isChecked = false
                binding.respect.isChecked = false

                binding.respect.isEnabled = false
                binding.happines.isEnabled = false
                binding.optimism.isEnabled = false
                binding.kindness.isEnabled = false
                binding.giving.isEnabled = false


            } else {
                bottomNavView.visibility = View.VISIBLE
                binding.respect.isEnabled = true
                binding.happines.isEnabled = true
                binding.optimism.isEnabled = true
                binding.kindness.isEnabled = true
                binding.giving.isEnabled = true

            }

        }
    }

    fun giving() {
        binding.giving.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {
                bottomNavView.visibility = View.VISIBLE

            } else {bottomNavView.visibility = View.GONE}
            if (itemCount>5) bottomNavView.visibility = View.GONE
        }
    }

    fun happiness() {
        binding.happines.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {
                bottomNavView.visibility = View.VISIBLE

            } else bottomNavView.visibility = View.GONE
            if (itemCount>5) bottomNavView.visibility = View.GONE
        }
    }


    fun kindness() {
        binding.kindness.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {
                bottomNavView.visibility = View.VISIBLE

            } else bottomNavView.visibility = View.GONE
            if (itemCount>5) bottomNavView.visibility = View.GONE
        }
    }

    fun optimism() {
        binding.optimism.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {
                bottomNavView.visibility = View.VISIBLE

            } else bottomNavView.visibility = View.GONE
            if (itemCount>5) bottomNavView.visibility = View.GONE

        }
    }

    fun respect() {
        binding.respect.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {
                bottomNavView.visibility = View.VISIBLE

            } else bottomNavView.visibility = View.GONE
            if (itemCount>5) bottomNavView.visibility = View.GONE
        }
    }

}


