package com.example.myapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.buttons.ButtonsFragment
import com.example.myapplication.check.CheckFragment
import com.example.myapplication.history.HistoryFragment

class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ButtonsFragment()
            1 -> CheckFragment()
            2 -> HistoryFragment()
            else -> ButtonsFragment()
        }
    }
}