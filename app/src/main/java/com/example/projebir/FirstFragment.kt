package com.example.projebir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.projebir.databinding.FragmentFirstBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class FirstFragment : Fragment() {

    val bottomNavView by lazy {
        requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationBar)
    }

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    val ego = binding.ego
    val giving = binding.giving
    val respect = binding.respect
    val happines = binding.happines
    val kindness = binding.kindness
    val optimism = binding.optimism

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bottomNavView.visibility = View.GONE
        giving.isEnabled=false
        respect.isEnabled=false
        happines.isEnabled=false
        kindness.isEnabled=false
        optimism.isEnabled=false

        ego()
        giving()
        respect()
        happiness()
        kindness()
        optimism()


    }


    fun ego() {

        ego.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                bottomNavView.visibility = View.GONE
                giving.isChecked = false
                happines.isChecked = false
                optimism.isChecked = false
                kindness.isChecked = false
                respect.isChecked = false

            } else {
                bottomNavView.visibility = View.VISIBLE
                respect.isEnabled = true
                happines.isEnabled = true
                optimism.isEnabled = true
                kindness.isEnabled = true
                giving.isEnabled = true

            }
        }
    }


    fun giving() {
        if (ego.isChecked) giving.isEnabled = false
        val menu = bottomNavView.menu
        giving.setOnCheckedChangeListener() { _, isChecked ->

            if (isChecked) {

                if (bottomNavView.menu.size() < 5) {
                    if (menu.findItem(R.id.givingFragment) == null) {
                        menu.add(Menu.NONE, R.id.givingFragment, Menu.NONE, "giving")
                            .setIcon(R.drawable.giving_24)
                    }
                } else {
                    Toast.makeText(
                        requireContext(),
                        "5'den fazla item eklenemez!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                val item = menu.findItem(R.id.givingFragment)
                if (item != null) menu.removeItem(R.id.givingFragment)

            }


        }
    }


    fun happiness() {
        if (ego.isChecked) happines.isEnabled = false
        val menu = bottomNavView.menu
        happines.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {
                if (bottomNavView.menu.size() < 5) {
                    if (menu.findItem(R.id.happinesFragment) == null) {
                        menu.add(Menu.NONE, R.id.happinesFragment, Menu.NONE, "happiness")
                            .setIcon(R.drawable.happy_24)
                    }
                } else {
                    Toast.makeText(
                        requireContext(),
                        "5'den fazla item eklenemez!",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            } else {
                val item = menu.findItem(R.id.happinesFragment)
                if (item != null) menu.removeItem(R.id.happinesFragment)

            }

        }
    }


    fun kindness() {
        if (ego.isChecked) kindness.isEnabled = false
        val menu = bottomNavView.menu
        kindness.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {

                if (bottomNavView.menu.size() < 5) {
                    if (menu.findItem(R.id.kindnessFragment) == null) {
                        menu.add(Menu.NONE, R.id.kindnessFragment, Menu.NONE, "kindness")
                            .setIcon(R.drawable.kind_24)
                    }
                } else {
                    Toast.makeText(
                        requireContext(),
                        "5'den fazla item eklenemez!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                val item = menu.findItem(R.id.kindnessFragment)
                if (item != null) menu.removeItem(R.id.kindnessFragment)

            }
        }
    }


    fun optimism() {
        if (ego.isChecked) optimism.isEnabled = false
        val menu = bottomNavView.menu
        optimism.setOnCheckedChangeListener() { _, isChecked ->
            if (isChecked) {

                if (bottomNavView.menu.size() < 5) {
                    val menu = bottomNavView.menu
                    if (menu.findItem(R.id.optimismFragment) == null) {
                        menu.add(Menu.NONE, R.id.optimismFragment, Menu.NONE, "optimism")
                            .setIcon(R.drawable.optimism_24)

                    }
                } else {
                    Toast.makeText(
                        requireContext(),
                        "5'den fazla item eklenemez!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                val item = menu.findItem(R.id.optimismFragment)
                if (item != null) menu.removeItem(R.id.optimismFragment)

            }

        }
    }

    fun respect() {
        if (ego.isChecked) respect.isEnabled = false
        respect.setOnCheckedChangeListener() { _, isChecked ->
            val menu = bottomNavView.menu

            if (isChecked) {

                if (bottomNavView.menu.size() < 5) {

                    if (menu.findItem(R.id.respectFragment) == null) {
                        menu.add(Menu.NONE, R.id.respectFragment, Menu.NONE, "respect")
                            .setIcon(R.drawable.respect_24)

                    }
                } else Toast.makeText(
                    requireContext(),
                    "5'den fazla item eklenemez!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val item = menu.findItem(R.id.respectFragment)
                if (item != null) {
                    menu.removeItem(R.id.respectFragment)

                }
            }
        }

    }
}
