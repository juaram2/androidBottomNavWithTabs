package com.cloudHospital.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cloudHospital.R

private val TAB_TITLES = arrayOf(
  R.string.general_health,
  R.string.beauty
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: HomeFragment, fm: FragmentManager)
  : FragmentPagerAdapter(fm) {

  override fun getItem(position: Int): Fragment {
    // getItem is called to instantiate the fragment for the given page.
    // Return a PlaceholderFragment (defined as a static inner class below).
    return HomeTabFragment.newInstance(position + 1)
  }

  override fun getPageTitle(position: Int): CharSequence? {
    return context.resources.getString(TAB_TITLES[position])
  }

  override fun getCount(): Int {
    // Show 2 total pages.
    return 2
  }
}