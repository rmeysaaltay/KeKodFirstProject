package com.example.projebir

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projebir.databinding.FragmentFirstBinding
import com.example.projebir.databinding.FragmentSplashBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashFragment : Fragment() {
    val bottomNavView by lazy {
        requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationBar)
    }

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

   private val scope= CoroutineScope(Dispatchers.Main)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bottomNavView.visibility = View.GONE
        scope.launch {
            delay(500)
            findNavController().navigate(R.id.action_splashFragment_to_firstFragment)


        }


        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


}