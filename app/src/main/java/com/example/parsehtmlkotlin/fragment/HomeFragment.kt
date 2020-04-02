package com.example.parsehtmlkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.parsehtmlkotlin.adapter.HomeAdapter
import kotlinx.android.synthetic.main.home_fragment.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(com.example.parsehtmlkotlin.R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = HomeAdapter(childFragmentManager)
        adapter.addFragment(NewFragment(),"Tin tức")
        adapter.addFragment(CODFragment(),"COD Star")
        adapter.addFragment(MasterDevFragment(),"MasterDev")
        vp.adapter =adapter
        tab.setupWithViewPager(vp)
    }

}