package com.cloudHospital.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.cloudHospital.R
import com.google.android.material.tabs.TabLayout


class HomeFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val root = inflater.inflate(R.layout.fragment_home, container, false)

    val sectionsPagerAdapter = SectionsPagerAdapter(this, childFragmentManager)
    val viewPager: ViewPager = root.findViewById(R.id.view_pager)
    viewPager.adapter = sectionsPagerAdapter
    val tabs: TabLayout = root.findViewById(R.id.tabs)
    tabs.setupWithViewPager(viewPager)

    return root
  }
}