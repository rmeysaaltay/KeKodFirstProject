package com.example.projebir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
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
        giving()
        respect()
        happiness()
        kindness()
        optimism()


    }


    fun ego() {
        val menu = bottomNavView.menu
        binding.ego.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.giving.isChecked = false
                binding.happines.isChecked = false
                binding.optimism.isChecked = false
                binding.kindness.isChecked = false
                binding.respect.isChecked = false
                if (menu.findItem(R.id.egoFragment2) == null) {
                    menu.add(Menu.NONE, R.id.egoFragment2, Menu.NONE, "giving")
                        .setIcon(R.drawable.ego_24)
                }
            } else {
                val item = menu.findItem(R.id.egoFragment2)
                if (item != null) menu.removeItem(R.id.egoFragment2)

                binding.respect.isEnabled = true
                binding.happines.isEnabled = true
                binding.optimism.isEnabled = true
                binding.kindness.isEnabled = true
                binding.giving.isEnabled = true

            }}}



    fun giving() {
        if (binding.ego.isChecked) binding.giving.isEnabled = false
        val menu = bottomNavView.menu
        binding.giving.setOnCheckedChangeListener() { _, isChecked ->
            if (itemCount > 4) {
                if (isChecked) {
                    if (menu.findItem(R.id.givingFragment) == null) {
                        menu.add(Menu.NONE, R.id.givingFragment, Menu.NONE, "giving")
                            .setIcon(R.drawable.giving_24)
                    }
                } else {
                    val item = menu.findItem(R.id.givingFragment)
                    if (item != null) menu.removeItem(R.id.givingFragment)
                }
            } else binding.giving.isEnabled=false
        }
    }


    fun happiness() {
        if (binding.ego.isChecked) binding.happines.isEnabled = false
        val menu = bottomNavView.menu
            binding.happines.setOnCheckedChangeListener() { _, isChecked ->
                if (itemCount < 4) {
                    if (isChecked) {
                        if (menu.findItem(R.id.happinesFragment) == null) {
                            menu.add(Menu.NONE, R.id.happinesFragment, Menu.NONE, "happiness")
                                .setIcon(R.drawable.happy_24)
                        }

                    } else {
                        val item = menu.findItem(R.id.happinesFragment)
                        if (item != null) menu.removeItem(R.id.happinesFragment)
                    }
                } else binding.happines.isEnabled=false
            }
        }



    fun kindness() {
        if (binding.ego.isChecked) binding.kindness.isEnabled = false
        val menu = bottomNavView.menu
        binding.kindness.setOnCheckedChangeListener() { _, isChecked ->
            if (itemCount < 4) {
                if (isChecked) {
                    if (menu.findItem(R.id.kindnessFragment) == null) {
                        menu.add(Menu.NONE, R.id.kindnessFragment, Menu.NONE, "kindness")
                            .setIcon(R.drawable.kind_24)
                    }
                } else {
                    val item = menu.findItem(R.id.kindnessFragment)
                    if (item != null) menu.removeItem(R.id.kindnessFragment)
                }
            } else binding.kindness.isEnabled=false
        }
    }


    fun optimism() {
        if (binding.ego.isChecked) binding.optimism.isEnabled = false
        val menu = bottomNavView.menu
        binding.optimism.setOnCheckedChangeListener() { _, isChecked ->
            if (itemCount < 4) {
                if (isChecked) {
                    val menu = bottomNavView.menu
                    if (menu.findItem(R.id.optimismFragment) == null) {
                        menu.add(Menu.NONE, R.id.optimismFragment, Menu.NONE, "optimism")
                            .setIcon(R.drawable.optimism_24)
                            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)

                    }
                } else {
                    val item = menu.findItem(R.id.optimismFragment)
                    if (item != null) menu.removeItem(R.id.optimismFragment)
                }
            } else binding.optimism.isEnabled = false
        }
    }

    fun respect() {
        if (binding.ego.isChecked) binding.respect.isEnabled = false
        binding.respect.setOnCheckedChangeListener() { _, isChecked ->
            val menu = bottomNavView.menu
            if (itemCount < 4) {
                if (isChecked) {

                    if (menu.findItem(R.id.respectFragment) == null) {
                        menu.add(Menu.NONE, R.id.respectFragment, Menu.NONE, "respect")
                            .setIcon(R.drawable.respect_24)
                            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                    }
                } else {
                    val item = menu.findItem(R.id.respectFragment)
                    if (item != null) {
                        menu.removeItem(R.id.respectFragment)
                    }
                }
            }else binding.respect.isEnabled = false
        }
    }
}
