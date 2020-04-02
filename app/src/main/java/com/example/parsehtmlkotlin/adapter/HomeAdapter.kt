package com.example.parsehtmlkotlin.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.parsehtmlkotlin.fragment.CODFragment
import com.example.parsehtmlkotlin.fragment.MasterDevFragment
import com.example.parsehtmlkotlin.fragment.NewFragment

@Suppress("DEPRECATION", "UNREACHABLE_CODE")
class HomeAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (position) {
            0 -> {
                val newFragment = NewFragment()
                return newFragment
            }
            1 ->{
                val codFragment = CODFragment()
                return codFragment
            }
            2 ->{
                val masterDevFragment = MasterDevFragment()
                return masterDevFragment
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Tin tức"
            2 -> return "COD Star"
            3 -> return "MasterDEV"
        }
        return super.getPageTitle(position)
    }
}