package com.example.noteapp_akylbek.ui.fragments.onboard

import android.content.res.ColorStateList
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.noteapp_akylbek.R
import com.example.noteapp_akylbek.databinding.FragmentOnBoardBinding
import com.example.noteapp_akylbek.ui.adapters.OnBoardAdapter
import com.google.android.material.tabs.TabLayout.Tab
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListeners()
    }

    private fun initialize() {
        binding.viewPager.adapter = OnBoardAdapter(this)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, _ ->
            tab.setIcon(R.drawable.tab_selector)
        }.attach()
    }

    private fun setupListeners() = with(binding.viewPager) {
        registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) = with(binding) {
                super.onPageSelected(position)
                if (position == 2){
                    txtSkip.visibility = View.INVISIBLE
                }else{
                    txtSkip.visibility = View.VISIBLE
                }
            }
        })
        binding.txtSkip.setOnClickListener {
            setCurrentItem(currentItem + 1, true)
        }
    }
}