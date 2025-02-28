package com.example.noteapp_akylbek.ui.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.noteapp_akylbek.databinding.FragmentOnBoardBinding
import com.example.noteapp_akylbek.ui.fragments.onboard.OnBoardPagerFragment
import com.example.noteapp_akylbek.ui.fragments.onboard.OnBoardPagerFragment.Companion.ARG_ONBOARD_POSITION
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int) = OnBoardPagerFragment().apply {
        arguments = Bundle().apply {
            putInt(ARG_ONBOARD_POSITION , position)
        }
    }
}